package ch26_socket.simpleGUI.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ch26_socket.simpleGUI.server.dto.RequestBodyDto;
import ch26_socket.simpleGUI.server.dto.SendMessage;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConnectedSocket extends Thread {
	
	private final Socket socket;
	
	@Override
	public void run() {
		
		while(true) {
			try {
				BufferedReader bufferedReader = 
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String requestBody = bufferedReader.readLine();
				
				requestController(requestBody);
				
//				SimpleGUIServer.connectedSocketList.forEach(connectedSocket -> {
//					try {
//						PrintWriter printWriter = 
//								new PrintWriter(connectedSocket.socket.getOutputStream(), true);
//						printWriter.println(requestBody);
//						
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				});
				
//				for(ConnectedSocket connectedSocket : SimpleGUIServer.connectedSocketList) {
//					
//				}
//				
//				for(int i = 0; i < SimpleGUIServer.connectedSocketList.size(); i++) {
//					
//				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void requestController(String requestBody) {
		Gson gson = new Gson();
		
		String resource = gson.fromJson(requestBody, RequestBodyDto.class).getResource();
//		RequestBodyDto<SendMessage> requestBodyDto = gson.fromJson(requestBody, new TypeToken<RequestBodyDto<SendMessage>>() {}.getType());
		
		switch(resource) {
			case "sendMessage" :
				TypeToken<RequestBodyDto<SendMessage>> typeTokn = new TypeToken<RequestBodyDto<SendMessage>>() {};
				
				RequestBodyDto<SendMessage> requestBodyDto = gson.fromJson(requestBody, typeTokn.getType());
				SendMessage sendMessage = requestBodyDto.getBody();
				
				SimpleGUIServer.connectedSocketList.forEach(ConnectedSocket -> {
					RequestBodyDto<String> dto = new RequestBodyDto<String>("showMessage", sendMessage.getFromUsername() + ": " + sendMessage.getMessageBody());
					ServerSender.getInstance().send(ConnectedSocket.socket, dto);
				});
				
				break;
				
				
		default: 
			break;
		}
	}
}

package ch26_socket.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TextServer {

	public static void main(String[] args) {
		try {
			System.out.println("서버실행");
			ServerSocket serverSocket = new ServerSocket(8000);
			Socket socket = serverSocket.accept();
			
			Thread thread = new Thread(() -> {
				while(true) {
					System.out.println("데이터 입력 기다림");
					BufferedReader bufferedReader;
					try {
						InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
						bufferedReader = new BufferedReader(inputStreamReader);
						System.out.println(bufferedReader.readLine());
					}catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			});
					
			
			thread.start();
		} catch(IOException e) {
			
		}

	}

}

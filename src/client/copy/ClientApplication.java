package client.copy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;

public class ClientApplication extends JFrame {

	private JPanel mainPanel;
	private JTextField ipTextField;
	private JTextField portTextField_1;
	private JTextField messageTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientApplication frame = new ClientApplication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 305);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		
		// <<< 채팅내용 >>>
		JScrollPane chatTextAreaScrollPane = new JScrollPane();
		chatTextAreaScrollPane.setBounds(12, 10, 277, 208);
		mainPanel.add(chatTextAreaScrollPane);
		
		JTextArea chatTextArea = new JTextArea();
		chatTextArea.setEnabled(false);
		chatTextAreaScrollPane.setViewportView(chatTextArea);
		
		// <<< 채팅연결 >>>
		ipTextField = new JTextField();
		ipTextField.setBounds(303, 10, 119, 21);
		mainPanel.add(ipTextField);
		ipTextField.setColumns(10);
		
		portTextField_1 = new JTextField();
		portTextField_1.setBounds(301, 41, 121, 21);
		mainPanel.add(portTextField_1);
		portTextField_1.setColumns(10);
		
		JButton connectionButton = new JButton("접속");
		connectionButton.setFont(new Font("맑은 고딕", Font.PLAIN, 11));
		connectionButton.setBounds(301, 72, 121, 21);
		mainPanel.add(connectionButton);
		
		// <<< 접속자 >>>
		JScrollPane connectedUserListScrollPane = new JScrollPane();
		connectedUserListScrollPane.setBounds(301, 103, 121, 115);
		mainPanel.add(connectedUserListScrollPane);
		
		JList connectedUserList = new JList();
		connectedUserListScrollPane.setViewportView(connectedUserList);
		
		// <<< 메세지입력 및 전송 >>>
		messageTextField = new JTextField();
		messageTextField.setBounds(12, 228, 345, 28);
		messageTextField.setEnabled(false);
		mainPanel.add(messageTextField);
		messageTextField.setColumns(10);
		
		JButton messageSendButton = new JButton("전송");
		messageSendButton.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		messageSendButton.setEnabled(false);
		messageSendButton.setBounds(369, 228, 53, 28);
		mainPanel.add(messageSendButton);
	}
}

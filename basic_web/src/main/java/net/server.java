package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class server {

	public static void main(String[] args) {
		new data0_server();

	}

}


class data0_server{
	int port = 10000;
	DatagramSocket ds= null;															
	DatagramPacket dp= null;															
	InetAddress ia = null;															
	
	InputStreamReader isr = null;															
	BufferedReader br = null;															
	
	private DatagramSocket socket;
	
	public data0_server() {
		try {
			this.ds = new DatagramSocket(this.port);
			this.udp();
			
		}catch(Exception e) {
			System.out.println("UDP 포트 충돌로 인하여 서버가 작동 되지 않습니다.");
		}
	}
	
	
	private void udp() {
		try {
			
			while(true) {		
				byte server_byte[] = new byte[1024];
				
				
				
				this.dp = new DatagramPacket(server_byte, server_byte.length);
				System.out.println("상담시작!!");
				
				this.ds.receive(this.dp); 								
				
				String msg = new String(this.dp.getData());
				System.out.println(msg);
								
								
				
				System.out.println("메세지를 입력하세요 :");
				this.ia = this.dp.getAddress();
				
				
				int client_port = this.dp.getPort();
				
				
				this.isr = new InputStreamReader(System.in);						
				this.br = new BufferedReader(this.isr);						
				
				
				byte client_msg[] = this.br.readLine().getBytes();
				
				
				this.dp = new DatagramPacket(client_msg,client_msg.length,this.ia, client_port);
				this.ds.send(this.dp); 
				
				 DatagramPacket receivePacket = new DatagramPacket(client_msg, client_port);
				
				new Thread(new thread(receivePacket)).start();
			
			}
			
		}catch(Exception e) {
			System.out.println("UDP 서버 오류발생!!");
		}
	}
	
	
	
	 class thread implements Runnable {
	        private DatagramPacket packet;

	        public thread(DatagramPacket packet) {
	            this.packet = packet;
	        }

	        @Override
	        public void run() {
	            try {
	                InetAddress clientAddress = packet.getAddress(); 
	                int clientPort = packet.getPort();  
	                String receivedMessage = new String(packet.getData(), 0, packet.getLength()).trim();  // 받은 메시지
	                System.out.println("클라이언트로부터 받은 메시지: " + receivedMessage);


	                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	                System.out.print("클라이언트에게 보낼 메시지 입력: ");
	                String responseMessage = reader.readLine();  


	                byte[] responseBytes = responseMessage.getBytes();

	                
	                DatagramPacket responsePacket = new DatagramPacket(responseBytes, responseBytes.length, clientAddress, clientPort);
	                socket.send(responsePacket);
	                System.out.println("클라이언트에게 응답 보냈음: " + responseMessage);
	            } catch (Exception e) {
	                System.out.println("클라이언트 메시지 처리 중 오류 발생.");
	                e.printStackTrace();
	            }
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	
	 class thread implements Runnable {
	        private DatagramPacket packet;

	        public thread(DatagramPacket packet) {
	            this.packet = packet;
	        }

	        @Override
	        public void run() {
	            try {
	                InetAddress clientAddress = packet.getAddress();  
	                int clientPort = packet.getPort();  
	                String receivedMessage = new String(packet.getData(), 0, packet.getLength()).trim();  // 받은 메시지
	                System.out.println("클라이언트로부터 받은 메시지: " + receivedMessage);

	                
	                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	                System.out.print("클라이언트에게 보낼 메시지 입력: ");
	                String responseMessage = reader.readLine();  

	                
	                byte[] responseBytes = responseMessage.getBytes();

	                
	                DatagramPacket responsePacket = new DatagramPacket(responseBytes, responseBytes.length, clientAddress, clientPort);
	                socket.send(responsePacket);
	                System.out.println("클라이언트에게 응답 보냈음: " + responseMessage);
	            } catch (Exception e) {
	                System.out.println("클라이언트 메시지 처리 중 오류 발생.");
	                
	            }
	        }
	    }
	*/
}





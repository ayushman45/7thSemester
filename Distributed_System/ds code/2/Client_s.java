import java.net.*;
import java.io.*;
public class Client_s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
int port=1024;
try
{
InetAddress server_1=InetAddress.getLocalHost();
DatagramSocket client_socket=new DatagramSocket();
while(true)
{
	String msgtosend="hello! how r u?????";
	DatagramPacket p=new DatagramPacket(msgtosend.getBytes(), msgtosend.length(), server_1,port);
	client_socket.send(p);
	
	String msgfromserver;
	byte[] msg_rcvd_buffer=new byte[512];
	DatagramPacket p1=new DatagramPacket(msg_rcvd_buffer, msg_rcvd_buffer.length);
	client_socket.receive(p1);
	msgfromserver=new String(msg_rcvd_buffer, 0, p1.getLength());
	System.out.println("message from server is "+msgfromserver);
	Thread.sleep(1000);
	
			
}
	}catch(UnknownHostException e){e.printStackTrace();}

catch(SocketTimeoutException t){t.printStackTrace();}
catch(IOException e1){e1.printStackTrace();}
catch(InterruptedException e2){e2.printStackTrace();}
}
}
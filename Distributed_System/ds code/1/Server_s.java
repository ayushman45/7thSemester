import java.net.*;
import java.io.*;
public class Server_s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int port=1024;
DatagramSocket server1;
try
{
	server1=new DatagramSocket(port);
	while (true)
	{
		byte[] buffer=new byte[512];
		DatagramPacket p=new DatagramPacket(buffer, buffer.length);
		server1.receive(p);
		String msgfromclient=new String(buffer, 0, p.getLength());
		System.out.println("msg from client "+msgfromclient);
		String s1="I am fine";
		byte[] buffer_send=s1.getBytes();
		DatagramPacket p1=new DatagramPacket(buffer_send, buffer_send.length, p.getAddress(), p.getPort());
		server1.send(p1);
		
	}
	
}catch(SocketException e){e.printStackTrace();}
catch(IOException e1){e1.printStackTrace();}
	}

}

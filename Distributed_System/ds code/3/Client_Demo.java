import java.net.*;
import java.io.*;
public class Client_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket x;
		int port=203;
		try{
		InetAddress serverAddress=InetAddress.getLocalHost();
		x=new Socket(serverAddress,port);
		//send operation
		PrintWriter w=new PrintWriter(x.getOutputStream(),true);
		w.println("hellooooooooo! how are you");
		
		//Receive operation
		BufferedReader b=new BufferedReader(new InputStreamReader(x.getInputStream()));
		String mFromServer=b.readLine();
		System.out.println(mFromServer);
		b.close();
		w.close();
		x.close();
		}
		catch(UnknownHostException e){}
		catch(IOException e){
			System.out.println(e);
		}
	}

}

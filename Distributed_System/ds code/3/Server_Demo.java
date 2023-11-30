import java.net.*;
import java.io.*;
public class Server_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port=203;
		try{
			ServerSocket s=new ServerSocket(port);
			while(true){
				Socket y=s.accept();
				
				//Receive operation
				BufferedReader r=new BufferedReader(new InputStreamReader(y.getInputStream()));
				String messageFromClient=r.readLine();
				System.out.println(messageFromClient);
				
				//send operation
				PrintWriter w=new PrintWriter(y.getOutputStream(), true);
				w.println("yesi am fine");
				w.flush();
				w.close();
				r.close();
				
				
			}
			
			
		
		}
		catch(UnknownHostException e){
		}
		catch(IOException e){
			System.out.println(e);
		}
	}

}

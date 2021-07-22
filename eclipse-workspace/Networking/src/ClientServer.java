import java.awt.Desktop;
import java.io.*;
import java.net.*;

public class ClientServer {
public static void main(String[] args) 
{
	try 
	{

	Server sr=new Server();
	//sr.ReceiveSend();
       
		ServerSocket ss=new ServerSocket(25);
		Socket s=ss.accept();
	
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String)dis.readUTF();
System.out.println(str);

  	ss.close();
		
	}catch(Exception e) 
	{
		e.printStackTrace();
		
	}
}
}

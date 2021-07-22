package Connection;
import java.io.IOException;
import java.net.*;
public class Conn {
public static void main(String[] args) throws Exception
{
	
		Socket sock=null;
	
	 sock=new Socket("192.168.1.127",80);
		sock.getInetAddress().isReachable(1000);
	System.out.println(sock);
	

}
}

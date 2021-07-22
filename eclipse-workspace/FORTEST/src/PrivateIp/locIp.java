package PrivateIp;
import java.net.*;
public class locIp {

	public static void main(String[] args) {
		 InetAddress ip;
	        String hostname;
	        try {
	            ip = InetAddress.getLocalHost();
	            hostname = ip.getHostName();
	       
	         
	            
	            System.out.println( hostname);
	 
	        } catch (UnknownHostException e) {
	 
	            e.printStackTrace();
	        }

	}

}

package FindIps;

import java.net.InetAddress;

public class FindHostName {
	public static void main(String[] argv) throws Exception {
		InetAddress addr = InetAddress.getByName("142.250.187.164");
		System.out.println("Host name is: "+addr.getHostName());
		System.out.println("Ip address is: "+ addr.getHostAddress());
	}
}

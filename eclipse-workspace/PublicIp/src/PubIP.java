	import java.net.*;
	import java.io.*;

public class PubIP {


	public static void main(String[] args) throws Exception{
		URL whatismyip = new URL("http://checkip.amazonaws.com");
		BufferedReader in = new BufferedReader(new InputStreamReader(
		                whatismyip.openStream()));

		String ip = in.readLine(); 
		System.out.println(ip);

	}

}

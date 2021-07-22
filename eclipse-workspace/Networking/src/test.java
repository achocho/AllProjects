import java.io.*;

public class test {

	public static void main(String[] args) throws Exception {
		String cmd = "C:\\Users\\Admin\\Desktop\\stuff\\ngrok.exe tcp 25 ";

		Runtime r = Runtime.getRuntime();
		Process pr = r.exec(cmd);
        
		BufferedReader stdInput = new BufferedReader( new InputStreamReader( pr.getInputStream() ));

		String s =stdInput.readLine();
	 
		//while ((s = stdInput.readLine()) != null) {
// System.out.println("adfd");
			System.out.println(s);
		  
		//}

	}

}

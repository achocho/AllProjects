package CMdByJava;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class CmdRun {

public static void main(String[] args) 
{
	String[] command =
	    {
	        "cmd",
	    };
	    Process p;
	    while(true) {
		try {
			p = Runtime.getRuntime().exec(command);
		        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
	                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
	                PrintWriter stdin = new PrintWriter(p.getOutputStream());
	                stdin.println("start C:\\users\\achoc\\Desktop\\brightness\\Starter.ba");
	                stdin.close();
	                p.waitFor();
	    	} catch (Exception e) {
	    	
	 		e.printStackTrace();
	 		continue;
		}
	    }
}
	
}

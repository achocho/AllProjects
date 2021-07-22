package Exiting;
import java.util.*;
public class ExitAndRun {
public static void main(String[] args) 
{
	
	Runtime.getRuntime().addShutdownHook(new Thread() {

	    @Override
	    public void run() {
	       System.out.println("Exited");
	    }

	});	
	while(true) {
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	}
}
}

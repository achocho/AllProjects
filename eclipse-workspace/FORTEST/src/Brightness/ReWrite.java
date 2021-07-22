package Brightness;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReWrite {
	 public static String fileToString(String filePath) throws Exception{
	      String input = null;
	      Scanner sc = new Scanner(new File(filePath));
	      StringBuffer sb = new StringBuffer();
	      while (sc.hasNextLine()) {
	         input = sc.nextLine();
	         sb.append(input);
	      }
	      return sb.toString();
	  }
	public static void ChangePs(String value) throws Exception
{
	File BatStart=new File(System.getProperty("user.dir")+"\\low.ps1");
	String filePath=System.getProperty("user.dir")+"\\low.ps1";
	String result = fileToString(filePath);
	 
    //Replacing the word with desired one
	
	result=result.replaceAll("\\W", "");
	result=result.replaceAll(result, "");


	
	

//Rewriting the contents of the file
    PrintWriter writer = new PrintWriter(new File(filePath));
    writer.append(result);
    writer.flush();

    //System.out.println(fileToString(filePath));

	FileWriter write=new FileWriter(BatStart,true);
	write.write("(Get-WmiObject -Namespace root/WMI -Class WmiMonitorBrightnessMethods).WmiSetBrightness(1,"+value+")");
	write.close();

}

}

package Brightness;
import java.util.*;
import java.awt.Desktop;
import java.io.*;
public class Main {
public static void main(String[] args) throws Exception
{
	Scanner scan=new Scanner(System.in);

	ReWrite re=new ReWrite();
	boolean Checker=true;
	Starter str=new Starter();
	while(Checker) {
		String val=scan.nextLine();
		int value=Integer.parseInt(val);
	if(val.matches("[0-9]+")&&(value<=100&&value>=0)) 
	{
		re.ChangePs(val);
	
		
		Checker=false;
		
	}else 
	{
		System.out.println("Only numbers are accepted!");
		Checker=true;
	}
	int x=0;
	while(x<20) 
	{
		str.S();
		x++;
	
		
	}
	}
        
	

}


}

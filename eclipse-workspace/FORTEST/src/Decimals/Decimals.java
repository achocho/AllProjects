package Decimals;
import java.util.*;
public class Decimals {
public static void main(String[] args) 
{
	System.out.println((int)'?');
	Scanner scan=new Scanner(System.in);
	double x=scan.nextDouble();
	double s=scan.nextDouble();
	double result=x/s;
	String num=Double.toString(result);
	String decimal="";
	boolean write=false;
	for(int i=0;i<num.length();i++) 
	{
		if(num.charAt(i)=='.') 
		{
			write=true;
			
		}
		if(write&&num.charAt(i)!='.') 
		{
			decimal+=num.charAt(i);
			
		}
		
	}
	
	for(int i=decimal.length()-1;i>=0;i--) 
	{
		System.out.print(decimal.charAt(i));
		
	}
}
}

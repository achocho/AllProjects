import java.util.*;
public class Trapec {
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	double a=scan.nextDouble();
	double b=scan.nextDouble();
	double h=scan.nextDouble();
	double Area=0;
	try {
	if(a<=0||b<=0||h<=0) 
	{
		throw new Exception("Inputs can't be smaller than 1.");
		
	}else 
	{
		Area=(a+b)/2*h;
		System.out.println(Area);
		
	}
	}
	catch(Exception e) 
	{
		System.out.println(e.getMessage());
		
	}
}
}

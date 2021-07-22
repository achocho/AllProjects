import java.util.*;
public class Main {
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.print("a :");
	int a=scan.nextInt();
	System.out.print("b :");
	int b=scan.nextInt();
	System.out.print("c :");
	int c=scan.nextInt();
	
	try 
	{
		
	
		if(a+b<c||a+c<b||b+c<a||a<=0||b<=0||c<=0)
		{
			throw new Exception("The triangle isn't valid");
			
		}
	
		int P=a+b+c;
		System.out.println("P ="+P);
		double S=Math.sqrt(P*(P-a)*(P-b)*(P-c));
		System.out.println("S ="+(int)S);
	}
	catch(Exception e) 
	{
		System.out.println(e.getMessage());
		
	}

	
}
}

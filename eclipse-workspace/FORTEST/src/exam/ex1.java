package exam;
import java.util.*;
import java.lang.*;
public class ex1 {
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.print("a =");
 int a=scan.nextInt();
	System.out.print("b =");
 int b=scan.nextInt();
	System.out.print("c =");
 int c=scan.nextInt();
 int D=(int) Math.pow(b, 2)-4*a*c;

 if(D<0) 
 {
	System.out.println("The equation doesn't have solution");
	
 }else 
 {
	 int x1=(-b+(int)Math.sqrt(D))/2*a;
	 int x2=(-b-(int)Math.sqrt(D))/2*a;
	 System.out.println("x1="+x1);
	 System.out.println("x2="+x2);
 }
 
	 
	 
 
}
}

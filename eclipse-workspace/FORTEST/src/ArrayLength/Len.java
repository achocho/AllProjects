package ArrayLength;
import java.util.*;
public class Len {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int[] arr=new int[10];
while(true) {
int opt=scan.nextInt();
if(opt==1) 
{
	arr=new int[5];
	   for(int i=0;i<arr.length;i++) 
	      {
	    	  arr[i]=i;
	    	  System.out.println(arr[i]);
	      }
	System.out.println(arr.length);
}else 
{

	arr=new int[15];
      for(int i=0;i<arr.length;i++) 
      {
    	  arr[i]=i;
    	  System.out.println(arr[i]);
      }
	System.out.println(arr.length);
}
}	
}

}

package MagicalSquare;
import java.util.*;
public class MagicalSquare {
    public static void main(String[] args)
    {
    	
     Scanner scan=new Scanner(System.in);
     try {
    	 System.out.println("Enter an odd number!!!");
        int n = scan.nextInt();
        if(n%2==0) 
        {
        	throw new Exception("The number must be odd");
        	
        }else if(n<3) 
        {
        	throw new Exception("The number must be above or equal to 3");
        	
        }
        generateSquare(n);
     }
     catch(Exception e) 
     {
    	 System.out.println(e.getMessage());
     }
        
    }
	static void generateSquare(int n)
    {
        int[][] magicSquare = new int[n][n];
 
     int j=n-1;
     int i=n/2;
     for(int num=1;num<=n*n;) 
     {
    	 if(i==-1&&j==n) 
    	 {
    		 j=n-2;
    		 i=0;
    	 }else {
    	 if(i<0) 
    	 {
    		 i=n-1;
    		 
    	 }
    	 if(j==n) 
    	 {
    		 j=0;
    		 
    	 }
    	 }
    	 if(magicSquare[i][j]!=0) 
    	 {
    		 j-=2;
    		 i++;
    		 continue;
    		 
    	 }else 
    	 {
    		 magicSquare[i][j]=num++;
    		 j++;
    		 i--;
    		 
    	 }
    	 
     }
     System.out.println("The sum is :"+n*(n*n+1)/2);
     for( i=0;i<n;i++) 
     {
    	 for(j=0;j<n;j++) 
    	 {
    		 System.out.print(magicSquare[i][j]+" ");
    		
    		 
    	 }
    	 System.out.println();
     }
    }
 
   

}

 
 



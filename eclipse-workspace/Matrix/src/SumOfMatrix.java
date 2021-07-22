import java.util.*;
public class SumOfMatrix
{
	public static void main(String[] args) 
	{
		int[][] matrix=new int[5][5];
        Random random=new Random();
     
     
        for(int i=0;i<matrix.length;i++) 
        {
        	for(int j=0;j<matrix.length;j++) 
        	{
        	matrix[i][j]=(int)(Math.random()*100);	
        	
        	}
        	
        }
        
        int sum=0;
        for(int i=0;i<matrix.length;i++) 
        {
        	for(int j=0;j<matrix.length;j++) 
        	{
                if(i==j) 
                {
                	sum+=matrix[i][j];
                	
                }
        		
        	}
         
        }
        System.out.println(sum);
    
        
	}
}
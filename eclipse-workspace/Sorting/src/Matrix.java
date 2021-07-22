import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] massive=new int[3][3];
		
		for(int i=0;i<massive.length;i++) 
		{
			for(int j=0;j<massive.length;j++) 
			{
		massive[i][j]=scan.nextInt();
	
				
			}
			
		}
		int sum=0;
		for(int i=0;i<massive.length;i++) 
		{
			for(int j=0;j<massive.length;j++) 
			{
				if(i==j) 
				{
				sum+=massive[i][j];	
				
				}
				
			}
			
		}
		System.out.println(sum);

	}

}

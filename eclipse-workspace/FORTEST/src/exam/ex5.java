package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers count");
		int numsCount=scan.nextInt();
		int curr=0;
		int below=0;
		
		while(curr<numsCount) 
		{
			System.out.print(curr+1+" :");
			nums.add(scan.nextInt());
			curr++;
		}
		for(int i=0;i<nums.size();i++) 
		{
			if(nums.get(i)<7) 
			{
				below++;
				
			}
			
		}
		System.out.println(below);

	}

}

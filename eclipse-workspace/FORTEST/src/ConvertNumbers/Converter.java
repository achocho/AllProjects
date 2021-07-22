package ConvertNumbers;
import java.util.*;
public class Converter {

	public static void main(String[] args) {
	String numbers="";
	Scanner scan=new Scanner(System.in);
	numbers=scan.nextLine();
	List<String> nums=new ArrayList<>();
	String temp="";
	for(int i=0;i<numbers.length();i++) 
	{
		temp+=numbers.charAt(i);
		nums.add(temp);
		temp="";
		
	}
int arabic=0;
int check=0;
boolean minus1=false;
boolean minus10=false;
boolean minus100=false;
while(check<nums.size()) 
{
	if(nums.get(check).equals("I")) 
	{
		arabic++;
		minus1=true;
	}
	if(nums.get(check).equals("V")) 
	{
		
	if(minus1) 
	{
	if(arabic!=0) 
	{
		arabic--;
		
	}	
		arabic+=4;
		minus1=false;
	}
		
	else 
	{
		arabic+=5;
		
	}
	
	}
	if(nums.get(check).equals("X")) 
	{
		minus10=true;
		if(minus1) 
		{
		if(arabic!=0) 
		{
			arabic--;
			
		}	
			arabic+=9;
			minus1=false;
		}
			
		else 
		{
			arabic+=10;
			
		}
	}
	if(nums.get(check).equals("L")) 
	{
		
		if(minus10) 
		{
		if(arabic!=0) 
		{
			arabic-=10;
			
		}	
			arabic+=40;
			minus10=false;
		}
			
		else 
		{
		
		arabic+=50;
			
		}
	}

	if(nums.get(check).equals("C")) 
	{
		minus100=true;
		if(minus10) 
		{
		if(arabic!=0) 
		{
			arabic-=10;
			
		}	
			arabic+=90;
			minus10=false;
		}
			
		else 
		{
			arabic+=100;
			
		}
	}
	if(nums.get(check).equals("D")) 
	{
		if(minus100) 
		{
		if(arabic!=0) 
		{
			arabic-=100;
			
		}	
			arabic+=400;
			minus100=false;
		}
			
		else 
		{
			arabic+=500;
			
		}
	}
	if(nums.get(check).equals("M")) 
	{
		if(minus100) 
		{
		if(arabic!=0) 
		{
			arabic-=100;
			
		}	
			arabic+=900;
			minus100=false;
		}
			
		else 
		{
			arabic+=1000;
			
		}
	}
check++;
}

System.out.println(arabic);
	}

}

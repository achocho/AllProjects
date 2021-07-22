package exercise1;

import java.util.*;
public class group {
	static boolean calculate=true;
	public static void main(String[] args) 
	{

		while (calculate) {
		SortPrices();
		}
	}
	
	
	
	
	public static void SortPrices() 
	{
		 Properties prop = new Properties();
		List<String> Building   = new ArrayList<String>(); 
	Scanner scan=new Scanner(System.in);
	Random rand=new Random();
	
	int buildings=scan.nextInt();
	if(buildings==0) 
	{
		System.out.println("The calaculation finished!!!");
		calculate=false;
		
	}
	int x=0;
	for(int i=0;i<buildings;i++) 
	{
		int RandPrice=rand.nextInt(10000-1000+1)+1000;
	
	x=i;
		prop.put("BuildingProp"+x,RandPrice+" лв");
		

		Building.add((String)prop.getProperty("BuildingProp"+x));  
	}
	
	
 Building.sort(null);
	System.out.println(Building);
	
	}
}


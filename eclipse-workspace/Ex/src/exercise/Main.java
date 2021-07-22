package exercise;
import java.util.*;

public class Main {
public static void main(String[] args) 
{
	

try {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter num of apartments");
	int numOfApartments=scan.nextInt();
	System.out.println("Enter num of neighbourhoods");
	int numOfNeighbours=scan.nextInt();
	if(numOfApartments>numOfNeighbours) 
	{
	throw new Exception("Not enough space for new apartment");	
	}
		List<Apartment> apartments=new ArrayList<>();
	    Apartment apartment=new Apartment(0,0);
	List<String> neighbourhoods=new ArrayList<>();
	for(int i=0;i<numOfApartments;i++) 
	{


		apartments.add(new Apartment(scan.nextFloat(),scan.nextFloat()));

		
	}
	
	
	for(int i=0;i<=numOfNeighbours;i++) 
	{
		apartment.setNeighbourhood(scan.nextLine());
		neighbourhoods.add(apartment.getNeighourhood());
		
	}
	List<Float> prices=new ArrayList<>();
	Apartment apartment1 = apartment;
	prices.add(apartment1.getPrice());
    Collections.sort(prices);
    for(int i=0;i<prices.size();i++) 
    {
    	System.out.println(prices.get(i));
    	
    }
	

}
catch(Exception e) 
{
	System.out.println(e.getMessage());
}
}
}

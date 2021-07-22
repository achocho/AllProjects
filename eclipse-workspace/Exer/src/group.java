import java.util.*;
public class group {
	public static void main(String[] args) 
	{
		SortPrices();
		
	}
	
	
	
	
	public static void SortPrices() 
	{
		List<Float> prices   = new ArrayList<Float>(); 
	Scanner scan=new Scanner(System.in);
	Random rand=new Random();
	
	int buildings=scan.nextInt();
	for(int i=0;i<buildings;i++) 
	{
		float RandPrice=rand.nextInt(10000-1000+1)+1000;
		prices.add(RandPrice);
		Collections.sort(prices);
	}
	System.out.println(prices);
	}
}

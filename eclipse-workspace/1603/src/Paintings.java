import java.util.*;
public class Paintings  {
List<Painting> paintings=new ArrayList<>();
Paintings(Painting paintings)
{
	this.paintings.add(paintings);
}
public void SetPaintings(List<Painting> paintings) 
{
	this.paintings=paintings;
}
public List<Painting> GetPaintings()
{
return paintings;	
}
public void AddPainting(Painting pn) 
{
	
	for(int i=0;i<paintings.size();i++) 
	{
		if(paintings.get(i)!=pn) 
		{
			paintings.add(pn);
			
		}else 
		{
			System.out.println("The painting has been added.");
			
		}
		
	}
}
public void DeletePainting(int id) 
{
for(int i=0;i<paintings.size();i++) 
{
	if(paintings.get(i).GetId()==id) 
	{
		paintings.remove(i);
		
	}else 
	{
		System.out.println("The painting is deleted or doesn't exist in the list!!!");
		
	}
}
}
public void PrintAuthor(String author) 
{
	for(int i=0;i<paintings.size();i++) 
	{
		if(paintings.get(i).GetAuthor().equals(author)) 
		{
			System.out.println(paintings.get(i));
			
		}else if(paintings.get(i).GetAuthor().equals("")) 
		{
			System.out.println(paintings.get(i));
		}
		else 
		{
			System.out.println("This author doesn't exist.");
			
		}
		
	}
}
public void HighestPrice() 
{
	List<Double> prices=new ArrayList<>();	
for(int i=0;i<paintings.size();i++) 
{

prices.add(paintings.get(i).GetPrice());
	Collections.sort(prices);
	
}
	System.out.println(prices);
	
}
public void AvaragePrice(String author) 
{
	for(int i=0;i<paintings.size();i++) 
	{
		if(paintings.get(i).GetAuthor().equals(author)) 
		{
			System.out.println((paintings.get(i).GetPrice()+paintings.get(i).GetPrice())/2);
			
		}else if(paintings.get(i).GetAuthor().equals("")) 
		{
			
			System.out.println((paintings.get(i).GetPrice()+paintings.get(i).GetPrice())/2);
		}
		
	}
}
}

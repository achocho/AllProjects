
public class Apartment {
String neighbourhood;
double price;
double Area;
Apartment(double price,double Area,String neighbourhood)
{
	this.neighbourhood=neighbourhood;
	this.price=price;
	this.Area=Area;
}
public void SetNeighbourhood(String neighbourhood) 
{
	this.neighbourhood=neighbourhood;
}
public String getNeighbourhood() 
{
return neighbourhood;	
}
public void SetPrice(double price) 
{
	this.price=price;
}
public double getPrice() 
{
return price;	
}
public void SetArea(double Area) 
{
	this.Area=Area;
}
public double getArea() 
{
return Area;	
}
}

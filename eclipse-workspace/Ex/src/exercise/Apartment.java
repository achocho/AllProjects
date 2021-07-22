package exercise;

public class Apartment {
String neighbourhood;
float price;
float Area;
Apartment(float price,float Area)
{
	
	this.price=price;
	this.Area=Area;
}
public String getNeighourhood() 
{
return neighbourhood;	
}
public float getPrice() 
{
return price;	
}
public float getArea() 
{
return Area;	
}
public void setNeighbourhood(String neighbourhood) 
{
	this.neighbourhood=neighbourhood;
}
public void setPrice(float price) 
{
	this.price=price;
}
public void setArea(float Area) 
{
	this.Area=Area;
}
}


public class Painting {
private String name;
private String author;
private double price;
private int year;
private int id;
Painting(String name,String author,double price,int year,int id)
{
	this.name=name;
	this.author=author;
	this.price=price;
	this.year=year;
	this.id=id;
}
public void SetName(String name) 
{
	this.name=name;
}
public void SetAuthor(String author) 
{
	this.author=author;
}
public void SetPrice(double price) 
{
	this.price=price;
}
public void SetYear(int year ) 
{
	this.year=year;
}
public void SetId(int id ) 
{
	this.id=id;
}
public String GetName() 
{
return name;	
}
public String GetAuthor() 
{
return author;	
}
public double GetPrice() 
{
return price;	
}
public int GetYear() 
{
return year;	
}
public int GetId() 
{
return id;	
}
public void Print() 
{
System.out.println("The name is:"+name);
System.out.println("The author is:"+author);
System.out.println("The price is:"+price);
System.out.println("The year is:"+year);
System.out.println("The id is:"+id);
}


}

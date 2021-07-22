package exer;
public class Person {

public String name;
public byte age;
public String id;
	Person(String name,Byte age,String id)
{
	this.name=name;
	this.age=age;
	this.id=id;
}
	public String getName() 
	{
		return name;
		
	}
	public void SetName(String name) 
	{
		this.name=name;
		
	}
	public Byte getAge() 
	{
		return age;
		
	}
	public void SetAge(Byte age) 
	{
		this.age=age;
		
	}
	public String getId() 
	{
		return id;
		
	}
	public void setId(String id) 
	{
		this.id=id;
		
	}
}

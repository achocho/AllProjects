
public class Person {
private  String name;
public String phone;
public Person(String name,String phone)
{
	this.name=name;
	this.phone=phone;
}
public String getName() 
{
return this.name;	
}
public String toString() 
{

return this.name +","+this.phone;	
}
}

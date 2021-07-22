package exer;
public class Employ extends Person {
	private String company;
public Employ(String name,Byte age,String id,String company) 
{
super(name,age,id);	
this.company=company;
}
public String getCompany() 
{
return company;	
}
public void SetCompany(String company) 
{
	this.company=company;
}
}

package exer;

public class Student extends Person{
	private String school;
public Student(String name,Byte age,String id,String school)
{
super(name,age,id);
	this.school=school;
}


public void setSchool(String school) 
{
	this.school=school;
}
public String getSchool() 
{
return school;	
}	
}

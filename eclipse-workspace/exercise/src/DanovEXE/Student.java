package DanovEXE;

public class Student {
private String name;
private String number;
private String BirthYear;
private float Grades;
Student(String name,String number,String BirthYear,float Grades)
{
	this.name=name;
	this.number=number;
	this.BirthYear=BirthYear;
	this.Grades=Grades;
}
public String GetName() 
{
return name;	
}
public void SetName(String name) 
{
	this.name=name;
}
public String Getnumber() 
{
return number;	
}
public void SetNumbere(String number) 
{
	this.number=number;;
}
public String GetBirthYear() 
{
return BirthYear;	
}
public void SetBirthYear(String BirthYear) 
{
	this.BirthYear=BirthYear;
}
public float GetGrades() 
{
return Grades;	
}
public void SetGrades(float Grades) 
{
	this.Grades=Grades;
}
}

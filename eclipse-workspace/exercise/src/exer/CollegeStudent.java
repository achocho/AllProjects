package exer;
public class CollegeStudent extends Student{
	private String facNumber;
public CollegeStudent(String name,Byte age,String id,String school,String facNumber) 
{
super(name,age,id,school);
this.facNumber=facNumber;
}
	public String getNumber() 
	{
		return facNumber;
	}
	public void SetNumber(String facNumber) 
	{
		this.facNumber=facNumber;
		
	}
}

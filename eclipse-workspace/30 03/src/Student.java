public class Student extends Person {
private static int faknum;
Course[] courses;
public double[] grades;
public Student(String name,String phone,int faknum)
{
	super(name,phone);
	this.faknum=faknum;
	courses=new Course[30];
grades=new double[30];
}
}

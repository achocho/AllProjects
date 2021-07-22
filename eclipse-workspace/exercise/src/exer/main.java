package exer;
public class main {

	public static void main(String[] args) {
        Person person=new Person(null,(byte) 0,null);
       String name;
       Byte age;
       String id;
       String school;
       String company;
       String facNumber;
       person.SetName("Gosho");
       person.SetAge((byte)17);
       person.setId("23235");
         name=person.getName();
         age=person.getAge();
         id=person.getId();
       Student student=new Student(name,age,id,null);
  
        
    student.setSchool("uktc");
    school=student.getSchool();
    Employ employ=new Employ(name,age,id,null);

    employ.SetCompany("Google");
    company=employ.getCompany();    
	CollegeStudent college=new CollegeStudent(name,age,id,school,null);

     college.SetNumber("1234");
     facNumber=college.getNumber();     
     System.out.println(name);
     System.out.println(id);
     System.out.println(age);
     System.out.println(school);
     System.out.println(company);
     System.out.println(facNumber);
	}

}

package exercise;

public class Main {

	
	public static void main(String[] args) {
		Person person=new Person(null, (byte) 0, null);
		person.setAge((byte) 15);
		person.setName("Gosho");
		person.setId("184376124");
		byte age=person.getAge();
		String name=person.getName();
		String id=person.getId();
		Student student=new Student(name,age,id,null);
	 student.setSchool("UKTC");
	String school=student.getSchool();
	
	Employ employ=new Employ(name,age,id,null);
	employ.setCompany("Google");
	String company =employ.getCompany();
	
	CollegeStudent college=new CollegeStudent(name,age,id,school,null);
	college.setFacNumber("190");
	String FaceNumber=college.getFacNumber();
	    System.out.println(name);
		System.out.println(age);
		System.out.println(id);
		System.out.println(school);
		System.out.println(company);
		System.out.println(FaceNumber);

	}

}

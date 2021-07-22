package exercise;
public class Student extends Person{
	
    private String school;

    public Student(String name, byte age, String id, String school) {
        super(name, age, id);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}







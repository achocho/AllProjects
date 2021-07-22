package exercise;

public class CollegeStudent extends Student{
    private String facNumber;

    public String getFacNumber() {
        return facNumber;
    }

    public void setFacNumber(String facNumber) {
        this.facNumber = facNumber;
    }

    public CollegeStudent(String name, byte age, String id, String school, String facNumber) {
        super(name, age, id, school);
        this.facNumber = facNumber;
    }
}
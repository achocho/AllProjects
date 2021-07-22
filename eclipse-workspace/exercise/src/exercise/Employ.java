package exercise;

public class Employ extends Person{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employ(String name, byte age, String id, String company) {
        super(name, age, id);
        this.company = company;
    }

}





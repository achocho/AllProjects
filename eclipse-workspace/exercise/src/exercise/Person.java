package exercise;
public class Person {
    private String name;
    private byte age;
    private String id;


    public byte getAge() {
        return age;
    }

    public Person(String name, byte age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

 
}




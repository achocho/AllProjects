
public class Teacher extends Person{
private static String position;
  public Teacher(String name, String phone,String position) {
		super(name, phone);
		this.position=position;
	
	}
	public Teacher(String name,String phone)
	{
		super(name,phone);
        position="ASSISTANT";		
	}



}

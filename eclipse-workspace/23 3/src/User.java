import java.util.*;
public class User {
private String username;
private String password;
List<Person> persons=new ArrayList<>();
User(String username,String password,List<Person> persons)
{
	this.persons=persons;
	this.username=username;
	this.password=password;
}
public void SetUsername(String username) 
{
	this.username=username;
}
public void SetPassword(String password) 
{
	this.password=password;
}
public String getUsername() 
{
return username;	
}
public String getPassword() 
{
return password;	
}
public void CheckRegistration() 
{
	
	
	for(int i=0;i<persons.size();i++) {
if(username.equals(persons.get(i).getName())&&password.equals(persons.get(i).getPassword())) 
{
	System.out.println("The user is registered");

	System.out.println(persons.get(i).getName()+" "+persons.get(i).getAddress()+" "+persons.get(i).getCity()+" "+persons.get(i).GetBirthday());
return;
}
	
	}
	System.out.println("The user isn't found");
}

}

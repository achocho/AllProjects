import java.util.*;
public class Main {

	public static void main(String[] args) {
	List<User> users=new ArrayList<>();
	List<Person> persons=new ArrayList<>();
Scanner scan=new Scanner(System.in);
String username=scan.nextLine();
String password=scan.nextLine();
persons.add(new Person("Ivan","Sofia","Ovcha Kupel","0542116255","12adr"));
persons.add(new Person("Pesho","Sofia","Ovcha Kupel","9552116255","1"));
persons.add(new Person("Kiril","Vraca","Buzludga","0952026255","12345"));
users.add(new User(username,password,persons));

for(int i=0;i<users.size();i++) 
{
	users.get(i).CheckRegistration();

}

	}

}

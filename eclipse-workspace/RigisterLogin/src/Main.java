import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		String name="";
		Scanner scan=new Scanner(System.in);
		String pass="";
		Login login=new Login();
		String des="";
		Register reg=new Register();
		System.out.println("Do you want to register?");
		des=scan.nextLine();
		if(des.equals("yes")) 
		{
			System.out.println("Registration");
			System.out.println();
			System.out.println("Enter name");
			name=scan.nextLine();
			System.out.println("Enter pass");
			pass=scan.nextLine();
			reg.Regist(name, pass);
			
		}else 
		{
			System.out.println("Login");
			System.out.println();
			System.out.println("Enter name");
			name=scan.nextLine();
			System.out.println("Enter pass");
			pass=scan.nextLine();
			login.Log(name, pass);
			
		}
		

	}

}

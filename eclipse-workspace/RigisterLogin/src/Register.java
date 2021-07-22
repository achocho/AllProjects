import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Register {
public void Regist(String name,String pass) throws Exception 
{
	Connection conn = null;
	String url = "jdbc:mysql://18.188.255.221:3306/";
	String dbName = "java";
	String driver = "com.mysql.cj.jdbc.Driver";
	String userName = "acho";
	String password = "1234";
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection(url+dbName,userName,password);
	String myusn=pass,myname=name;
	PreparedStatement ps=conn.prepareStatement("insert into users values(?,?)");
	Statement stmt = conn.createStatement();
	ps.setString(1,myname);
	ps.setString(2,myusn);	
	ps.executeUpdate();
	System.out.println("successfully registered!");
}
}

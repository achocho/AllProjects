import java.sql.*;

public class Login {
public void Log(String name,String pass) throws Exception
{
	Connection conn = null;
	String url = "jdbc:mysql://18.188.255.221:3306/";
	String dbName = "java";
	String driver = "com.mysql.cj.jdbc.Driver";
	String userName = "acho";
	boolean passed=false;
	String password = "1234";
	Class.forName(driver).newInstance();
	conn = DriverManager.getConnection(url+dbName,userName,password);
	String myusn="",myname="";
	Statement stmt = conn.createStatement();
	String sql = "SELECT * from users";
	ResultSet rs = stmt.executeQuery(sql);
	PreparedStatement statement = null;
    ResultSet resultSet = null;
    String sql1 = "SELECT COUNT(*) FROM users;";
    statement = conn.prepareStatement(sql1);
    resultSet = statement.executeQuery();
    int out=0;
    if(resultSet.next()) {
      out=resultSet.getInt(1);
  	PreparedStatement ps1=conn.prepareStatement("Delete From users");
  	ps1.executeUpdate();
    }
    System.out.println(out);
	while (rs.next())
	{
	myusn = rs.getString(1);
	myname=rs.getString(2);
	if(name.equals(myusn)&&pass.equals(myname)) 
	{
		passed=true;
		break;
		
	}
	
	} 
	if(passed) 
	{
		System.out.println("Passed");
		
	}else 
	{
		System.out.println("Didn't pass");
		
	}

}

	}	



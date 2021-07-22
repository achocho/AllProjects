import java.sql.*;
import java.io.*;
class Insert{
public static void main(String args[])throws Exception{
System.out.println("MySQL Connect Example.");
Connection conn = null;
String url = "jdbc:mysql://localhost:3306/";
String dbName = "ts";
String driver = "com.mysql.cj.jdbc.Driver";
String userName = "root";
String password = "";
Class.forName(driver).newInstance();
conn = DriverManager.getConnection(url+dbName,userName,password);
System.out.println("Connected to the database");
String myusn="Kolio",myname="Kolev";
PreparedStatement ps=conn.prepareStatement("INSERT INTO users VALUES (?, ?, NULL)");
Statement stmt = conn.createStatement();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


ps.setString(1,myusn);
ps.setString(2,myname);
ps.executeUpdate();




String sql = "SELECT * from users";
ResultSet rs = stmt.executeQuery(sql);
System.out.println("The records are :");
while (rs.next())
{
myusn = rs.getString(1);
myname=rs.getString(2);
System.out.println(rs.getRow()+"-"+myusn+" "+myname);
} //end while
conn.close();
}}
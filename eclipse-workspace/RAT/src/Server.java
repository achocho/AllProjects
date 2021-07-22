import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Server  {
	public static void main(String[] args) throws Exception{
		Connection conn=null;
		try {
       conn=conn();
		}catch(Exception e) 
		{
			System.out.println("No internet access!");
			
		}
		
		
	while(true) {
		try {
	
				Client.DeleteRows(conn,"Delete From clients Where id ="+"'"+Id()+"'");
				Thread.sleep(1500);
			List<String> ips=ReceiveIp(conn);
			List<String> locIps=ReceiveLocIp(conn);
			for(int i=0;i<ips.size()-1;i++) 
			{
				for(int j=0;j<ips.size()-1;j++) 
				{
					String ip1=ips.get(j);
					String ip2=ips.get(j+1);
					String locIp1=locIps.get(j);
					String locIp2=locIps.get(j+1);
					if(ip1.equals(ip2)) 
					{
						int z=0;
						while(locIp1.charAt(z)==locIp2.charAt(z)) 
						{
							z++;
							
						}
						String buff="";
						String buff1="";
							if(locIp1.charAt(z)>locIp2.charAt(z)) 
							{
								buff=locIp1;
								buff1=ip1;
								locIps.set(j, locIp2);
								locIps.set(j+1, buff);
								ips.set(j, ip2);
								ips.set(j+1, buff1);
							}
							
						
						
					}else 
					{
						int z=0;
						while(ip1.charAt(z)==ip2.charAt(z)) 
						{
							z++;
							
						}
						String buff="";
						String buff1="";
						if(ip1.charAt(z)>ip2.charAt(z)) 
						{
							buff1=locIp1;
							buff=ip1;
							ips.set(j, ip2);
							ips.set(j+1, buff);
							locIps.set(j, locIp2);
							locIps.set(j+1, buff1);
						}
						
					}
				}
			}
			if(ips.size()==0) 
			{
				continue;
				
			}
			int Max=0;
			System.out.println("---------------------------------");
			for(int i=0;i<ips.size();i++) 
			{
				System.out.println(i+1+": "+ips.get(i)+": "+locIps.get(i));
				Max=i+1;
				
			}

			System.out.println("---------------------------------");
			System.out.println("Enter which address you are going to controll!!");
			Scanner sc=new Scanner(System.in);
			int Cont=sc.nextInt();
			String ip=null;
			String loc=null;
			String serIp=SendIp();
		if(Max>=Cont&&Cont>=1) {
				ip=ips.get(Cont-1);
				loc=locIps.get(Cont-1);
				
		}else 
		{
			System.out.println("This connection doesn't exist!");
			continue;
			
		}
			
			int optLen=OptionsLen(conn,ip,loc);
			int lenConn=CanConnect(conn,ip,loc);
			String option="";
			if(optLen==0) {
	 option=SendOption(conn,ip,loc,serIp);
			}
		if(lenConn==0&&!option.equals("yes")&&optLen!=1) {

		Listen(SendCommandForDirectory(conn,ip,loc,serIp));
	
		}else if(!option.equals("yes")&&optLen!=1)
		{
			
			Listen(getCommand(conn));
			
			
		}else if(option.equals("yes")||optLen>=1)
		{
	for(String name:ReceiveNames()) {
			System.out.println(name);
	}
			
		}
	
		}catch(Exception e) 
		{
			continue;
			
		}
		
	}
	}
public static void Listen(String name) throws Exception
{
	ServerSocket serverSocket = new ServerSocket(80);

  
    int bytesRead;
  
        Socket clientSocket = null;
        clientSocket = serverSocket.accept();
         
        InputStream in = clientSocket.getInputStream();
        String FileName="";
    int len=0;
    if(name.charAt(name.length()-1)=='\\') 
    {
    	len=name.length()-1;
    	
    }else 
    {
    	len=name.length();
    	
    }
        for(int i=0;i<len;i++) 
        {
        	if(name.charAt(i)!='\\') 
        	{
        		FileName+=name.charAt(i);
        		
        	}else
        	{
        	
        		
        		FileName="";
        		
        		
        		}
        	}
      
        OutputStream output = new FileOutputStream(System.getProperty("user.dir")+"\\"+FileName);
           
        byte[] buffer = new byte[1024];
        while ((bytesRead = in.read(buffer)) != -1) {
            output.write(buffer, 0, bytesRead);
        }
        
        output.close();	
       serverSocket.close();
       clientSocket.close();
}
public static String SendCommandForDirectory(Connection conn,String ip,String loc,String SerIp) throws Exception
{
	Scanner scan=new Scanner(System.in);
	PreparedStatement ps=conn.prepareStatement("insert into commands values(?,?,?,?,?)");
    System.out.println("Enter directory :");
    String command=scan.nextLine();
	ps.setString(1,command);
	ps.setString(2, Id());
	ps.setString(3, ip);
	ps.setString(4, loc);
	ps.setString(5, SerIp);
	ps.executeUpdate();
	
	return command;
}
public static int CanConnect(Connection conn,String ip,String loc) throws Exception
{

	 String sql1 = "SELECT COUNT(*) FROM commands Where id ="+"'"+Id()+"'"+" And ip ="+"'"+ip+"'"+" And locIp ="+"'"+loc+"'"+";";
	PreparedStatement statement = null;
    ResultSet resultSet = null;
    statement = conn.prepareStatement(sql1);
    resultSet = statement.executeQuery();
    int out=0;
    if(resultSet.next()) {
      out=resultSet.getInt(1);
 
  
    }
return out;	
}
public static String getCommand(Connection conn) throws Exception
{
	Statement stmt = conn.createStatement();
	String sql = "SELECT * from commands Where id ="+Id();
	ResultSet rs = stmt.executeQuery(sql);
	String comm="";
   while(rs.next()) {
comm= rs.getString(1);
   }

    return comm;



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
	return conn;
}
public static String SendOption(Connection conn,String ip,String loc,String SerIp) throws Exception
{
	Scanner scan=new Scanner(System.in);
	Scanner scan1=new Scanner(System.in);
	PreparedStatement ps=conn.prepareStatement("insert into options values(?,?,?,?,?)");
    System.out.println("Do you want to see files?");
    System.out.println("Yes/no");
    String directory="";
    String command=scan.nextLine();
    if(command.equalsIgnoreCase("yes")) {
    	System.out.println("Enter directory in which you want to see files!");
    	directory=scan1.nextLine();
	ps.setString(1, directory);
	ps.setString(2, Id());
	ps.setString(3, ip);
	ps.setString(4, loc);
	ps.setString(5, SerIp);
	ps.executeUpdate();
    }

	
	return command;
}
public static String[] ReceiveNames() throws Exception
{
	
	ServerSocket ss =new ServerSocket(80);

	Socket sn=ss.accept();
	ObjectInputStream dis=new ObjectInputStream(sn.getInputStream());
String[] names=(String[]) dis.readObject();
	
	ss.close();
	sn.close();
	return names;
}
public static int OptionsLen(Connection conn,String ip,String loc) throws Exception
{

	 String sql1 = "SELECT COUNT(*) FROM options Where id ="+"'"+Id()+"'"+" And ip ="+"'"+ip+"'"+" And locIp ="+"'"+loc+"'"+";";
	PreparedStatement statement = null;
    ResultSet resultSet = null;
    statement = conn.prepareStatement(sql1);
    resultSet = statement.executeQuery();
    int out=0;
    if(resultSet.next()) {
      out=resultSet.getInt(1);
 
  
    }
return out;	
}
public static String Id() 
{
	File configFile = new File(System.getProperty("user.dir")+"\\conf.properties");
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
public static void WriteServerProperty(String id) throws Exception
{
	 Properties props = new Properties();
	    props.setProperty("ID", id);
    
	    props.store(new FileOutputStream(System.getProperty("user.dir")+"\\conf.properties"), null);
}
public static List<String> ReceiveIp(Connection conn) throws Exception
{

	List<String> comm=new ArrayList<>();
	
	
	Statement stmt = conn.createStatement();
	String sql = "SELECT * from clients Where id ="+Id();
		
	ResultSet rs = stmt.executeQuery(sql);

   while(rs.next()) {
comm.add(rs.getString(1));
   }
   
 
    return comm;
}
public static List<String> ReceiveLocIp(Connection conn) throws Exception
{

	List<String> comm=new ArrayList<>();
	
	
	Statement stmt = conn.createStatement();
	String sql = "SELECT * from clients Where id ="+Id();
		
	ResultSet rs = stmt.executeQuery(sql);

while(rs.next()) {
comm.add(rs.getString(3));
}



 return comm;
}
public static String SendIp() throws Exception
{
	URL whatismyip = new URL("http://checkip.amazonaws.com");
	BufferedReader in = new BufferedReader(new InputStreamReader(
	whatismyip.openStream()));



	String ip = in.readLine(); 
	return ip;
}
}

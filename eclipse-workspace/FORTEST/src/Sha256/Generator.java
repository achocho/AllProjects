package Sha256;
import java.security.MessageDigest;
public class Generator {
public static void main(String[] args) throws Exception
{
String ts="snidg";
MessageDigest md=MessageDigest.getInstance("SHA-256");
md.update(ts.getBytes());
byte[] digest=md.digest();
String st=new String();
for(byte b:digest) 
{
	st+=(String.format("%02x",b&0xff));
}
System.out.println(st.toString());
}
}

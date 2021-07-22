import java.net.*;
import java.io.*;
 
public class Client {
     
    public static void main(String[] args) throws IOException {
 
        Socket sock = new Socket("127.0.0.1", 80);
 
        // sendfile
        File myFile = new File("C:\\Users\\achoc\\Pictures\\br.png");
        byte[] mybytearray = new byte[(int) myFile.length()];
         
        FileInputStream fis = new FileInputStream(myFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        bis.read(mybytearray, 0, mybytearray.length);
         
        OutputStream os = sock.getOutputStream();
         
        os.write(mybytearray, 0, mybytearray.length);
         
        os.flush();
         
        sock.close();
    }
}
package ShowFiles;
import java.io.*;
public class Files {
public static void main(String[] args) 
{
	String[] pathnames;

    File f = new File("C:\\users\\achoc\\Desktop");

    pathnames = f.list();

    for (String pathname : pathnames) {
       
        System.out.println(pathname);
    }	
}
}

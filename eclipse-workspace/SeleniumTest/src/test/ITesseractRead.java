package test;
import net.sourceforge.tess4j.*;

import java.util.*;

import org.openqa.selenium.io.FileHandler;

import java.io.*;
public class ITesseractRead {
public static void main(String[] args) throws Exception
{
	Read("1","1");	

}
public static void Read(String photoName,String textName) throws Exception
{
	File newText=new File("C:\\Users\\Admin\\Desktop\\texts\\"+textName+".txt");
	newText.createNewFile();
	String path="C:\\Users\\Admin\\Desktop\\photos\\"+photoName+".png";
	FileWriter writer=new FileWriter(newText,true);
ITesseract image=new Tesseract();
image.setDatapath("C:\\Users\\Admin\\Desktop\\stuff\\data");
String imageText=image.doOCR(new File(path));
writer.write(imageText);
writer.close();
System.out.println("You are ready!!");	
}
}

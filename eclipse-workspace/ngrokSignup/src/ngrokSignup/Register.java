package ngrokSignup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
public class Register {
	public static Robot robot=null;
public static void main(String[] args) throws Exception 
{

	try 
	{
		robot=new Robot();
		
	}catch(Exception e) 
	{
		e.printStackTrace();
		
	}

	//Inputer();
	
	

}




public static void click() 
{
	int x=0;
	int y=0;
	Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
	x=(int)size.getWidth()/2;
	y=(int)size.getHeight()/2+(int)size.getHeight()/4;
robot.mouseMove(x, y);	
robot.delay(5);
robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
}
public static void Inputer() throws Exception
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Mat\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dashboard.ngrok.com/signup");
	Thread.sleep(2000);
click();
}
}

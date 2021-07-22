package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class FirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		File file=new File("C:\\Users\\Admin\\Desktop\\Chromer\\Starter.vbs");
		//Desktop.getDesktop().open(file);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\lib\\geckoDrive\\chromedriver.exe");
	 ChromeOptions option=new ChromeOptions();
	 option.setExperimentalOption("debuggerAddress", "localhost:9014");
	 option.addArguments("--disable-blink-features=AutomationControlled");
	 WebDriver driver=new ChromeDriver();
	
	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/div[4]/div[2]/div/input")).click();
		Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("window.open('about:blank','-blank')");	
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://temp-mail.org/");
		
	
		Thread.sleep(6000);
		String email=driver.findElement(By.id("mail")).getAttribute("value");
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/div[4]/div[2]/div/input")).sendKeys(email);
			
	}

}

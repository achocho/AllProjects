package test;
import java.io.*;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import org.openqa.selenium.io.*;
import net.sourceforge.tess4j.*;

public class YandexRegistration {
	 private static final int IMG_WIDTH = 200;
	    private static final int IMG_HEIGHT = 50;

public static void main(String[] args) throws IOException, TesseractException, InterruptedException
{


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumTest\\lib\\geckoDrive\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-nofitications");
	options.addArguments("--headless");
	WebDriver driver=new ChromeDriver(options);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.get("https://passport.yandex.com/registration/mail?from=mail&require_hint=1&origin=hostroot_homer_reg_com&retpath=https%3A%2F%2Fmail.yandex.com%2F%3Fnoretpath%3D1&backpath=https%3A%2F%2Fmail.yandex.com%3Fnoretpath%3D1");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div/div/div/form/div[3]/div/div[2]/div/div[1]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div/div/div/form/div[3]/div/div[2]/div/div[1]/span")).click();
	js.executeScript("window.scrollBy(0,1000)");
Thread.sleep(6000);
	File src=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div/div/div/form/div[3]/div/div[2]/div[2]/div/div[1]/img")).getScreenshotAs(OutputType.FILE);;

	String path="C:\\screenshots\\captcha.png";
	FileHandler.copy(src, new File(path));
Path source = Paths.get("C:\\screenshots\\captcha.png");
Path target = Paths.get("C:\\screenshots\\captcha1.png");



try (InputStream is = new FileInputStream(source.toFile())) {
    resize(is, target, IMG_WIDTH, IMG_HEIGHT);
}



String targetPath="C:\\screenshots\\captcha1.png";	

	ITesseract image=new Tesseract();
	image.setDatapath("C:\\Users\\Admin\\Desktop\\data");
	
	String imageText=image.doOCR(new File(targetPath));
	
	System.out.println(imageText);

	
}
private static void resize(InputStream input, Path target,
        int width, int height) throws IOException {

BufferedImage originalImage = ImageIO.read(input);

/**
* SCALE_AREA_AVERAGING
* SCALE_DEFAULT
* SCALE_FAST
* SCALE_REPLICATE
* SCALE_SMOOTH
*/
Image newResizedImage = originalImage
.getScaledInstance(width, height, Image.SCALE_SMOOTH);

String s = target.getFileName().toString();
String fileExtension = s.substring(s.lastIndexOf(".") + 1);

// we want image in png format
ImageIO.write(convertToBufferedImage(newResizedImage),
fileExtension, target.toFile());

}
public static BufferedImage convertToBufferedImage(Image img) {

    if (img instanceof BufferedImage) {
        return (BufferedImage) img;
    }

    // Create a buffered image with transparency
    BufferedImage bi = new BufferedImage(
            img.getWidth(null), img.getHeight(null),
            BufferedImage.TYPE_INT_ARGB);

    Graphics2D graphics2D = bi.createGraphics();
    graphics2D.drawImage(img, 0, 0, null);
    graphics2D.dispose();

    return bi;
}
}

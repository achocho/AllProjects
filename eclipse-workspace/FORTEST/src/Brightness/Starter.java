package Brightness;

import java.awt.Desktop;
import java.io.File;

public class Starter {
public void S() throws Exception
{
	File file=new File(System.getProperty("user.dir")+"\\RunRunLow.vbs");	
	Desktop.getDesktop().open(file);	
}
}

package ag.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ReadConfig;

public class registrationconf {
    WebDriver driver;
    ReadConfig readconfig = new ReadConfig();
	public registrationconf(WebDriver driver)
	{
		this.driver=driver;
	}

public String getpagetext()
{
	String registerconftxt = readconfig.FetchData(".\\resources\\registrationconf.properties","conftext");
	System.out.println("jo");
	String verifytxt=driver.findElement(By.xpath(registerconftxt)).getText();
	
	
	return verifytxt;
	
}
}

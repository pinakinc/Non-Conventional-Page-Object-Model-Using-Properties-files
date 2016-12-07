package ag.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ReadConfig;

public class homePage {
	
	public WebDriver driver;
	ReadConfig readconfig = new ReadConfig();
	String registerlnk = readconfig.FetchData(".\\resources\\homepage.properties","registerLink");
	
	
	public homePage(WebDriver driver)
	{
		
		this.driver=driver;
		System.out.println("inside");
	}
	
	public registration clickLnk()
	{
//		registerlnk="\""+registerlnk+"\"";
		registerlnk=registerlnk.trim();
		System.out.println(registerlnk);
		driver.findElement(By.xpath(registerlnk)).click();
		return new registration(driver);
	}
	
}

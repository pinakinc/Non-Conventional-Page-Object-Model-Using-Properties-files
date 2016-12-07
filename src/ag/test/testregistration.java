package ag.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ag.pom.homePage;
import ag.pom.registration;
import ag.pom.registrationconf;

public class testregistration {
	public WebDriver driver;
	public homePage hmpage;
	public registration rgpage;
	public registrationconf confpg;
	
    @BeforeTest
    public void setUp()
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagyashree\\Desktop\\Documents\\Selenium\\jars\\chromedriver.exe");

		driver = new ChromeDriver();
		hmpage = new homePage(driver);

		rgpage = new registration(driver);
		confpg = new registrationconf(driver);

    }

    @AfterTest
    public void TearDown()
    {

		driver.quit();
    }

    
    @Test
	public void hometest()
	{


		driver.get("http://newtours.demoaut.com");

		hmpage.clickLnk();
		
		//driver.quit();
	}
	
	@Test(dependsOnMethods = { "hometest" })
	public void fnametest()
	{
		rgpage.enterfirstName("Pinakin");
		
		
		//driver.quit();
	}
	
	@Test(dependsOnMethods = { "fnametest" })
	public void lnametest()
	{
		rgpage.enterlastName("Chaubal");
		
		
		//driver.quit();
	}

	@Test(dependsOnMethods = { "lnametest" })
	public void phonetest()
	{
		rgpage.enterphone("8622027532");
		
		
		//driver.quit();
	}
	
	@Test(dependsOnMethods = { "phonetest" })
	public void userNametest()
	{
		rgpage.enteruserName("pinakinc");
		
		
		//driver.quit();
	}

	@Test(dependsOnMethods = { "userNametest" })
	public void address1test()
	{
		rgpage.enteraddress1("357 Brittany Farms");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "address1test" })
	public void address2test()
	{
		rgpage.enteraddress2("Apt 103");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "address2test" })
	public void citytest()
	{
		rgpage.entercity("New Britain");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "citytest" })
	public void statetest()
	{
		rgpage.enterstate("Connecticut");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "statetest" })
	public void postalcodetest()
	{
		rgpage.enterpostalcode("06053");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "postalcodetest" })
	public void countrytest()
	{
		rgpage.entercountry("TUVALU");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "countrytest" })
	public void emailtest()
	{
		rgpage.enteremail("pinakinc@yahoo.com");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "emailtest" })
	public void passwordtest()
	{
		rgpage.enterpassword("p9121975");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "passwordtest" })
	public void confirmpasswordtest()
	{
		rgpage.enterconfirmpassword("p9121975");
		
		
		//driver.quit();
	}
	@Test(dependsOnMethods = { "confirmpasswordtest" })
	public void clickregistertest()
	{
		rgpage.clickregister();
		
		
		//driver.quit();
	}
	
	@Test(dependsOnMethods = { "clickregistertest" })
	public void confirmtext()
	{
		String verifytext;
		verifytext=confpg.getpagetext();
		Assert.assertTrue(verifytext.contains("Thank you"));
		
		//driver.quit();
	}

}

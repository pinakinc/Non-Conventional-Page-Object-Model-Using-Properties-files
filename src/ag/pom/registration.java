package ag.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import util.ReadConfig;

public class registration {
	
	public WebDriver driver;
	ReadConfig readconfig = new ReadConfig();
	String firstname = readconfig.FetchData(".\\resources\\registration.properties","firstName");
	String lastname = readconfig.FetchData(".\\resources\\registration.properties","lastName");
	String phone = readconfig.FetchData(".\\resources\\registration.properties","phone");
	String username = readconfig.FetchData(".\\resources\\registration.properties","userName");
	String address1 = readconfig.FetchData(".\\resources\\registration.properties","address1");
	String address2 = readconfig.FetchData(".\\resources\\registration.properties","address2");
	String city = readconfig.FetchData(".\\resources\\registration.properties","city");
	String state = readconfig.FetchData(".\\resources\\registration.properties","state");
	String postalcode = readconfig.FetchData(".\\resources\\registration.properties","postalCode");
	String country = readconfig.FetchData(".\\resources\\registration.properties","country");
	String email = readconfig.FetchData(".\\resources\\registration.properties","email");
	String password = readconfig.FetchData(".\\resources\\registration.properties","password");
	String confirmpassword = readconfig.FetchData(".\\resources\\registration.properties","confirmPassword");
	String register = readconfig.FetchData(".\\resources\\registration.properties","register");
	
	public registration(WebDriver driver)
	{
		this.driver=driver;
	}

	public registration enterfirstName(String fname)
	{
		firstname=firstname.trim();
		driver.findElement(By.xpath(firstname)).sendKeys(fname);
		return new registration(driver);

	}
	public registration enterlastName(String lname)
	{
		lastname=lastname.trim();
		driver.findElement(By.xpath(lastname)).sendKeys(lname);
		return new registration(driver);

	}
	public registration enterphone(String phn)
	{
		driver.findElement(By.xpath(phone)).sendKeys(phn);
		return new registration(driver);

	}
	public registration enteruserName(String usrnm)
	{
		driver.findElement(By.xpath(username)).sendKeys(usrnm);
		return new registration(driver);

	}
	public registration enteraddress1(String addr1)
	{
		driver.findElement(By.xpath(address1)).sendKeys(addr1);
		return new registration(driver);

	}
	public registration enteraddress2(String addr2)
	{
		driver.findElement(By.xpath(address2)).sendKeys(addr2);
		return new registration(driver);

	}
	public registration entercity(String cty)
	{
		driver.findElement(By.xpath(city)).sendKeys(cty);
		return new registration(driver);

	}
	public registration enterstate(String ste)
	{
		driver.findElement(By.xpath(state)).sendKeys(ste);
		return new registration(driver);

	}
	public registration enterpostalcode(String postalcd)
	{
		driver.findElement(By.xpath(postalcode)).sendKeys(postalcd);
		return new registration(driver);

	}
	public registration entercountry(String ctry)
	{
		Select drpdown = new Select(driver.findElement(By.xpath(country)));
		drpdown.selectByVisibleText(ctry);
		return new registration(driver);

	}
	public registration enteremail(String eml)
	{
		driver.findElement(By.xpath(email)).sendKeys(eml);
		return new registration(driver);

	}
	public registration enterpassword(String pass)
	{
		driver.findElement(By.xpath(password)).sendKeys(pass);
		return new registration(driver);

	}
	public registration enterconfirmpassword(String cpass)
	{
		driver.findElement(By.xpath(confirmpassword)).sendKeys(cpass);
		return new registration(driver);

	}
	public registrationconf clickregister()
	{
		driver.findElement(By.xpath(register)).click();
		return new registrationconf(driver);

	}

}

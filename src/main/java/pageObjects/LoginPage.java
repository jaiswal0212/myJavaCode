package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;
	
	//By signin = By.cssSelector("a[href*='sign_in']");
	By username = By.cssSelector("[id='user_email']");
	By password = By.cssSelector("[type='password']");
	By login = By.cssSelector("[name ='commit']");
	
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement loginButton()
	{
		return driver.findElement(login);
	}
	
	
 public LoginPage(WebDriver driver) {
	 this.driver = driver;
	 
 }
}




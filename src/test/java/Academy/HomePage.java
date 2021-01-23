package Academy;

import java.io.IOException;
import java.util.Collections;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resource.Base;

public class HomePage extends Base{
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String usename, String password) throws IOException
	{
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		//Collections.sort(A);
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		LoginPage l = new LoginPage(driver);
		l.getusername().sendKeys(usename);
		l.getpassword().sendKeys(password);
		l.loginButton().click();
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Set1@gmail.com";
		data[0][1] = "Set1password";
		
		data[1][0] = "Set2@gmail.com";
		data[1][1] = "Set2password";
		return data;
		
	}
	

}

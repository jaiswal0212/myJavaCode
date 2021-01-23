package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import resource.Base;

public class LandingPageTest extends Base{
	@BeforeTest
	public void initialize() {
		try {
			driver = initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}driver.get(url);
	}
	@Test
	public void ValidateText()
	{
		
		
		//Collections.sort(A);
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals("FEATURED COURSES", lp.MainText().getText());
		//lp.MainText().

}@AfterTest
	public void teardown() {
	driver.close();
}
	}

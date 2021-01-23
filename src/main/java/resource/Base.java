package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public String url;
	//String url = prop.getProperty("url");
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ruby\\E2EProject\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		 url = prop.getProperty("url");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruby\\Selenium\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		}else
			if(browser.equals("IE")) {
				System.setProperty("webdriver.InternetExplorer.driver", "C:\\Users\\Ruby\\Selenium\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			    driver = new ChromeDriver();
			}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	public void getScreenshot() throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(src, C:\\Users\\Ruby\\E2EProject\\Screenshot);

	}
	


}

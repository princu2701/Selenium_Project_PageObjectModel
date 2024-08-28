package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BASES {
//Created Protected method so that i can call it as per requirement
	protected WebDriver driver;

	protected String Site;

	protected String Searched;

	protected String VPin;

	protected String IvPin;

	protected String headSearch;

	@BeforeMethod
//Open Browser Process and use to attract the property from the config file and managed all in browser activities
	public void setup() throws IOException {

		driver = new ChromeDriver();

		Properties properties = new Properties();

		FileInputStream file = new FileInputStream(
				"C:\\Users\\Prince Raj\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SELENIUM_PROJECT_Pom_Model\\src\\test\\resources\\config.properties");

		properties.load(file);

		Site = properties.getProperty("url");

		Searched = properties.getProperty("search1");

		VPin = properties.getProperty("pin1");

		IvPin = properties.getProperty("pin2");

		headSearch = properties.getProperty("head");

		driver.get(Site);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

	}

	@AfterMethod

	// Closed the Browser after all processes

	public void end() throws InterruptedException {

		Thread.sleep(2000);

		driver.quit();

	}

}

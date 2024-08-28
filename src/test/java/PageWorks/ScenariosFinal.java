package PageWorks;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Tests.BASES;

public class ScenariosFinal extends BASES {
//Initialized all this globally
	HomePage hPage;

	ProductSecenarios listProductSecenarios;

	Assert assert1;

	ExtentReports fullExtentReports;

	ExtentTest Testing;

// Used Extent Reports class for generating the reports
	@BeforeClass

	public void report() {

		fullExtentReports = new ExtentReports(
				"C:\\Users\\Prince Raj\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\SELENIUM_PROJECT_Pom_Model\\ProjectReport.html");

		Testing = fullExtentReports.startTest("Project Work");

	}

	/*
	 * 
	 * All Process Below are for the Checking the Functionality and creating the
	 * reports as per the accordance After getting all the test cases passed, we can
	 * generate a well defined report All functionalities working has been included
	 * here
	 * 
	 */

	// Reached to the Car Accessories Part and Asserted the Current Title
	@Test
	public void selection() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.caracc();

		Testing.log(LogStatus.PASS, "Reached Car Accessories Page Successfully");

		String element = driver.getTitle();

		Assert.assertEquals(element,
				"Car Accessories Online Store in India - Buy Latest Car Accessories Online at Best Price Deals - Naaptol.com");

		Testing.log(LogStatus.PASS, "Verified Car Accessories Page and also Asserted the Title");
	}

//Scenario 1 - Reaching the target place and validating that URL matches the same
	@Test
	public void scenario1() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.caracc();

		Testing.log(LogStatus.PASS, "Reached Car Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.carPage();

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL,
				"https://www.naaptol.com/shop-online/automobiles/car-accessories/car-utilities.html?ntpromoid=47501&utm_source=Banners_Ads&utm_campaign=Category-Banner-Car-Accessories");

		Testing.log(LogStatus.PASS, "Successfully Reached Accessories Page");

	}
//Scenario 2 - Entering data in search box and asserting that results are related to the data entered inside the SearchBox 

	@Test
	public void scenario2() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.caracc();

		Testing.log(LogStatus.PASS, "Reached Car Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.searching(Searched);

		String titlesElement = driver.getTitle();

		Assert.assertEquals(titlesElement,
				"Branded Car Accessories - Buy Branded Car Accessories Online in India at Naaptol.com");

		Testing.log(LogStatus.PASS,
				"Verified the working of Search box which includes some brand names to get entered");

	}

	// Scenario 3 - Clicking on product and asserting that whether it has been added
	// to cart or not

	@Test
	public void scenario3() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.caracc();

		Testing.log(LogStatus.PASS, "Reached Car Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.productprocess1();

		String oa = driver.findElement(By.linkText("Heavy Duty Car Dent Remover - Buy 1 Get 1 Free")).getText();

		Assert.assertEquals(oa, "Heavy Duty Car Dent Remover - Buy 1 Get 1 Free");

		Testing.log(LogStatus.PASS,
				"Successfully Handled the Another window and Added the product the Cart with Asserting its box");

	}

	// Scenario 4 - Verifying that the brand names provided at left end contains
	// some data
	@Test
	public void scenario4() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.caracc();

		Testing.log(LogStatus.PASS, "Reached Car Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.Youviq();

		Assert.assertEquals(driver.getTitle(),
				"Yoviq Car Accessories - Buy Yoviq Car Accessories Online in India at Naaptol.com");

		driver.navigate().back();

		listProductSecenarios.avl();

		driver.navigate().back();

		listProductSecenarios.hop();

		Testing.log(LogStatus.PASS, "Tested the presence of All brands present at left end");

	}

	// Scenario 5 -Sort the product by most expensive
	@Test
	public void scenario5() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.bikeacc();

		Testing.log(LogStatus.PASS, "Reached Bike Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.sorting();

		String urls = driver.getCurrentUrl();

		Assert.assertEquals(urls, "https://www.naaptol.com/shop-online/automobiles/bike-accessories.html");

		Testing.log(LogStatus.PASS, "Verified the working of Sorting Functionality in the Bike Accessories Page");

	}

	// Verifying the working functionality of Pincodes with some active and inactive
	// areas

	@Test
	public void scenario6() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.bikeacc();

		Testing.log(LogStatus.PASS, "Reached Car Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.pincodesearch(VPin, IvPin);

		// We must get a alert after entering invalid pincode always and it will get
		// handled here

		driver.switchTo().alert().accept();

		Testing.log(LogStatus.PASS, "Verified Valid and Invalid Pincodes and Handled the Alert ");

	}

	// Comparison Between the 2 products inside the bike accessories

	@Test
	public void scenario7() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.bikeacc();

		Testing.log(LogStatus.PASS, "Reached Bike Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.comparison();

		// Assert that product has been compared in a box

		String compareElement = driver.findElement(By.xpath("//*[.='Comparing 2 similar products']")).getText();

		Assert.assertEquals(compareElement, "Comparing 2 similar products");

		Testing.log(LogStatus.PASS,
				"Verified the working functionality of Compare Now and Asserted the Box of Products");

	}

	// Verifying that we can see the maximum discounted product and one less

	@Test

	public void scenario8() throws InterruptedException {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.bikeacc();

		Testing.log(LogStatus.PASS, "Reached Bike Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.discounts();

		Testing.log(LogStatus.PASS, "Verified the working of Discount Options Functionality");

	}

	// Verifying Price Funtionality and Checking wishlist functionality inside
	// pricecheck
	@Test
	public void scenario9() throws InterruptedException {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.bikeacc();

		Testing.log(LogStatus.PASS, "Reached Bike Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.pricecheck();

		Testing.log(LogStatus.PASS, "Verified the working of Price Filter Functionality with almost all varities");

	}

	// Verifying that Search Functionality takes the input of Car Accessories or Not
	@Test
	public void scenario10() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.bikeacc();

		Testing.log(LogStatus.PASS, "Reached Bike Accessories Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.headsearch(headSearch);

		Testing.log(LogStatus.PASS, "Verified the working of Main Search Functionality");

	}

	@Test
	public void scenario11() {

		hPage = new HomePage(driver);

		hPage.reach1();

		hPage.carandbike();

		hPage.utilities();

		Testing.log(LogStatus.PASS, "Reached Car Utilities Page Successfully");

		listProductSecenarios = new ProductSecenarios(driver);

		listProductSecenarios.quickcheck();

		Testing.log(LogStatus.PASS, "Verified the working of QuickCheck Functionality");

	}

	@AfterClass

	public void donereporting() {

		fullExtentReports.flush();

		fullExtentReports.endTest(Testing);

	}

}

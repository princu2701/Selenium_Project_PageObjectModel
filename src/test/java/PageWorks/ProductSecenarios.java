package PageWorks;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSecenarios {
//Maked the WebDriver AND Actions Globally Accessible
	WebDriver driver;

	Actions actions;

	public ProductSecenarios(WebDriver driver) {
//Re-initialiazed driver, Actions to get access for this page 
		this.driver = driver;

		this.actions = new Actions(driver);

		PageFactory.initElements(driver, this);

	}

//Used Find for storing Locators
	@FindBy(css = "[src='//layout.naptol.com/usr/local/csp/staticContent/naaptolAds/Category-Banner-Car-Accessories-18-09-23.jpg']")
	private WebElement headAccessoriesElement;

	@FindBy(xpath = "(//*[@title='Branded'])[1]")
	private WebElement BrandElement;

	@FindBy(xpath = "(//*[@title='Yoviq'])[1]")
	private WebElement youviqElement;

	@FindBy(xpath = "(//*[@title='AVL'])[1]")
	private WebElement avlElement;

	@FindBy(xpath = "(//*[@title='Hop n Go'])[1]")
	private WebElement hopElement;

	@FindBy(partialLinkText = "Heavy Duty")
	private WebElement product1;

	@FindBy(partialLinkText = "Car Dashboard")
	private WebElement product2;

	@FindBy(css = "[placeholder='Search Brand']")
	private WebElement TypenSearchElement;

	@FindBy(xpath = "(//*[.='Branded'])[1]")
	private WebElement Option1;

	@FindBy(css = "[alt='title=']")
	private WebElement addtocartElement;

	@FindBy(css = "#sortByFilter")
	private WebElement sortedElement;

	// --------------------------------- Bike Page Elements Are Inside This

	@FindBy(css = "#pincode")
	private WebElement pincodeElement;

	@FindBy(xpath = "(//*[@class='button_1'])[1]")
	private WebElement searchPincodElement;

	@FindBy(css = "#brandFilterBox8313")
	private WebElement BrandedinBikesElement;

	@FindBy(css = "#priceFilterBox1")
	private WebElement pricefilterElement;

	@FindBy(css = "#discountFilterBox5")
	private WebElement maxdiscElement;

	@FindBy(xpath = "(//*[@class='v_bottom'])[1]")
	private WebElement comparison1;

	@FindBy(xpath = "(//*[@class='v_bottom'])[3]")
	private WebElement comparison2;

	@FindBy(xpath = "(//*[.=' Compare Now '])[1]")
	private WebElement comparebuttonElement;

	@FindBy(xpath = "(//*[.='Quick View'])[2]")
	private WebElement quickbuttonElement;

	@FindBy(xpath = "(//*[@id='discountFilterBox3'])")
	private WebElement lessDiscElement;

	@FindBy(xpath = "(//*[@class='wish2'])[1]")
	private WebElement wish;

	@FindBy(css = "#header_search_text")
	private WebElement headersearchElement;

	// --------------------------------------------//
//used getter method for getting values in return
	public WebElement getHeadersearchElement() {
		return headersearchElement;
	}

	public WebElement getWish() {
		return wish;
	}

	public void setWish(WebElement wish) {
		this.wish = wish;
	}

	public WebElement getLessDiscElement() {
		return lessDiscElement;
	}

	public void setLessDiscElement(WebElement lessDiscElement) {
		this.lessDiscElement = lessDiscElement;
	}

	public WebElement getHeadAccessoriesElement() {
		return headAccessoriesElement;
	}

	public WebElement getBrandElement() {
		return BrandElement;
	}

	public WebElement getYouviqElement() {
		return youviqElement;
	}

	public WebElement getAvlElement() {
		return avlElement;
	}

	public WebElement getHopElement() {
		return hopElement;
	}

	public WebElement getProduct1() {
		return product1;
	}

	public WebElement getProduct2() {
		return product2;
	}

	public WebElement getTypenSearchElement() {
		return TypenSearchElement;
	}

	public WebElement getOption1() {
		return Option1;
	}

	public WebElement getAddtocartElement() {
		return addtocartElement;
	}

	public WebElement getSortedElement() {
		return sortedElement;
	}

	public WebElement getPincodeElement() {
		return pincodeElement;
	}

	public WebElement getSearchPincodElement() {
		return searchPincodElement;
	}

	public WebElement getBrandedinBikesElement() {
		return BrandedinBikesElement;
	}

	public WebElement getPricefilterElement() {
		return pricefilterElement;
	}

	public WebElement getMaxdiscElement() {
		return maxdiscElement;
	}

	public WebElement getComparison1() {
		return comparison1;
	}

	public WebElement getComparison2() {
		return comparison2;
	}

	public WebElement getComparebuttonElement() {
		return comparebuttonElement;
	}

	public WebElement getQuickbuttonElement() {
		return quickbuttonElement;
	}

	// ======================================= Element Usage Starts Below

	// ============================================//
//Created methods to use later on as per the requirement
	public void carPage() {

		headAccessoriesElement.click();

	}

	public void Youviq() {

		youviqElement.click();

	}

	public void branded() {

		BrandElement.click();

	}

	public void avl() {

		avlElement.click();

	}

	public void hop() {

		hopElement.click();

	}

	public void prod1() {

		product1.click();
	}

	public void prod2() {

		product2.click();
	}

	public void searching(String search) {

		TypenSearchElement.sendKeys(search);

		Option1.click();

	}

	public void productprocess1() {

		product1.click();

		String parentElement = driver.getWindowHandle();

		Set<String> childString = driver.getWindowHandles();

		for (String All : childString) {

			if (!All.equals(parentElement)) {

				driver.switchTo().window(All);

				addtocartElement.click();

			}

		}

	}

	public void sorting() {

		WebElement Sorts = sortedElement;

		Select filter = new Select(Sorts);

		filter.selectByValue("expensive");

	}

	public void pincodesearch(String pin1, String pin2) {

		pincodeElement.sendKeys(pin1);

		searchPincodElement.click();

		pincodeElement.clear();

		pincodeElement.sendKeys(pin2);

		searchPincodElement.click();

	}

	public void comparison() {

		comparison1.click();

		comparison2.click();

		comparebuttonElement.click();
	}

	public void discounts() throws InterruptedException {

		maxdiscElement.click();

		Thread.sleep(1000);

		lessDiscElement.click();
	}

	public void pricecheck() throws InterruptedException {

		pricefilterElement.click();

		Thread.sleep(1000);

		wish.click();
	}

	public void headsearch(String hs) {

		headersearchElement.sendKeys(hs);
	}

	public void quickcheck() {

		// Actions actions=new Actions(driver);

		actions.moveToElement(product1).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[.='Quick View'])[2]"))).click();

	}

}

package PageWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
// Make the  WebDriver and Actions for Globally Use
	WebDriver driver;

	Actions actions;

	public HomePage(WebDriver driver) {
		// Called this separate actions and driver using this method
		this.driver = driver;

		this.actions = new Actions(driver);
//Working using Pagefactory Model 
		PageFactory.initElements(driver, this);
	}

//Used @Findby to get all the locators for the homepage activities
	@FindBy(css = ".arrowNav")
	WebElement navigationElement;

	@FindBy(xpath = "(//*[@href='/shop-online/automobiles.html'])[1]")
	WebElement carandBikeAccessoriesElement;

	@FindBy(xpath = "(//*[@href='/shop-online/automobiles/bike-accessories.html'])[1]")
	WebElement BikeAccessoriesElement;

	@FindBy(xpath = "(//*[@href='/shop-online/automobiles/car-accessories.html'])[1]")
	WebElement carAccessoriesElement;

	@FindBy(xpath = "(//*[@href='/shop-online/automobiles/car-accessories/car-utilities.html'])[1]")
	WebElement carUtilitiesElement;

	// Used getter method to get elements in return
	public WebElement getNavigationElement() {
		return navigationElement;
	}

	public WebElement getCarandBikeAccessoriesElement() {
		return carandBikeAccessoriesElement;
	}

	public WebElement getBikeAccessoriesElement() {
		return BikeAccessoriesElement;
	}

	public WebElement getCarAccessoriesElement() {
		return carAccessoriesElement;
	}

	public WebElement getCarUtilitiesElement() {
		return carUtilitiesElement;
	}

	// Created methods so that we can use as per accordance
	public void reach1() {
		actions.moveToElement(navigationElement).build().perform();
	}

	public void carandbike() {
		actions.moveToElement(carandBikeAccessoriesElement).build().perform();
	}

	public void caracc() {
		actions.moveToElement(carAccessoriesElement).click().build().perform();
	}

	public void bikeacc() {
		actions.moveToElement(BikeAccessoriesElement).click().build().perform();
	}

	public void utilities() {
		actions.moveToElement(carUtilitiesElement).click().build().perform();
	}

}

package bstackPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class checkoutPage {
	WebDriver driver;
	WebDriverWait wait;
	
	 @FindBy(xpath="//div[@class='buy-btn']") WebElement Checkout_btn;
	 @FindBy(xpath="//input[@id='firstNameInput']") WebElement fName;
	 @FindBy(xpath="//input[@id='lastNameInput']") WebElement lName;
	 @FindBy(xpath="//input[@id='addressLine1Input']") WebElement Addr;
	 @FindBy(xpath="//input[@id='provinceInput']") WebElement State;
	 @FindBy(xpath="//input[@id='postCodeInput']") WebElement pincode;
	 @FindBy(xpath="//button[@id='checkout-shipping-continue']") WebElement submit;
	 
	 
	 public void checkout()
		{
		 wait.until(ExpectedConditions.elementToBeClickable(Checkout_btn)).click();
		    wait.until(ExpectedConditions.visibilityOf(fName));
		}
	 
	 public void firstName(String fname)
		{
		 wait.until(ExpectedConditions.visibilityOf(fName));

		       fName.sendKeys(fname);
		}
	 
	 public void lastName(String lname)
		{
		 lName.click();
		 lName.sendKeys(lname);
		}
	 
	 public void Address(String addr)
		{
		 Addr.click();
		 Addr.sendKeys(addr);
		}
	 public void state(String state)
		{
		 State.click();
		 State.sendKeys(state);
		}
	 public void pincode(String pin)
		{
		 pincode.click();
		 pincode.sendKeys(pin);
		}
	 
	 public void clickSubmit()
		{
		 submit.click();
		}
	 
	 
	 
	 

	 public checkoutPage(WebDriver driver) {
		 this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			PageFactory.initElements(driver, this);
	 }

}

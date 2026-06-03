package bstackPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class MultipleCart {
	WebDriver driver;
	WebDriverWait wait;
	
	 
	 @FindBy(xpath="//p[text()='iPhone 12']/following::div[contains(@class,'buy-btn')][1]") WebElement AddtoCart;
	 @FindBy(xpath="//p[text()='iPhone 11']/following::div[contains(@class,'buy-btn')][1]") WebElement AddtoCart2;
	 @FindBy(css=".bag__quantity") WebElement quantity;
	 
	 public void cart()
		{
		 wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
		 AddtoCart.click();
		 			
		}
	 
	 public void cart2()
		{
		 wait.until(ExpectedConditions.elementToBeClickable(AddtoCart2));
		 AddtoCart2.click();
		}
	 public void qty()
		{
		 String count = quantity.getText();

		    System.out.println("Quantity is: " + count);

		    Assert.assertEquals(count, "2");
		}


	 public MultipleCart(WebDriver driver) {
		 this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			PageFactory.initElements(driver, this);
	 }

}

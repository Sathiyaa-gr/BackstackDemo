package bstackPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class RemoveItemfromCart {
	WebDriver driver;
	WebDriverWait wait;
	
	 @FindBy(id="signin") WebElement Signin;
	 
	 @FindBy(xpath="//div[@class='shelf-item__del']") WebElement removecart;
	
	 
	 public void deleteCart()
		{
		 removecart.click();
		 Reporter.log("Item deleted");
		
			
		}

	 public RemoveItemfromCart(WebDriver driver) {
		 this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			PageFactory.initElements(driver, this);
	 }

}

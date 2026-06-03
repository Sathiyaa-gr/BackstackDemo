package bstackPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SingleCart {
	WebDriver driver;
	WebDriverWait wait;
	
	 @FindBy(id="signin") WebElement Signin;
	 
	 @FindBy(css="div[id='6'] div[class='shelf-item__buy-btn']") WebElement AddtoCart;
	
	 
	 public void cart()
		{
		 wait.until(
				    ExpectedConditions.elementToBeClickable(AddtoCart));
		 AddtoCart.click();
		 
		
			
		}

	 public SingleCart(WebDriver driver) {
		 this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			PageFactory.initElements(driver, this);
	 }

}

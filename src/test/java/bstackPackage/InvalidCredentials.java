package bstackPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InvalidCredentials {
	WebDriverWait wait;
	 WebDriver driver;
	 @FindBy(id="signin") WebElement Signin;
	 @FindBy(id="username") WebElement userName;
	 @FindBy(id="password") WebElement Password;
	 @FindBy(id="login-btn") WebElement LoginBtn;
	 @FindBy(xpath="//h3[@class='api-error']") WebElement errMsg;
	 
	 public void UserName()
		{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			// Click username dropdown
			WebElement userDropdown = wait.until(
			    ExpectedConditions.elementToBeClickable(userName));

			userDropdown.click();

			// Select username option
			
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='demouser']"))).click();

		}

	 public void Password()
		{
		 Password.click();
		 wait.until(ExpectedConditions.elementToBeClickable(
		     By.xpath("//div[text()='testing123']")
		 )).click();
		}

	 public void Login()
		{
		 WebElement login = wait.until(
			        ExpectedConditions.elementToBeClickable(LoginBtn)
			);

			login.click();
		}

	 
	 public void Error()
		{
		 //errMsg.click();
		 wait.until(ExpectedConditions.elementToBeClickable(errMsg)).click();
			Assert.assertEquals(errMsg.getText().contains("Invalid"),true);
			 System.out.println("Validation Passed");
			
		}

	 public InvalidCredentials(WebDriver driver) {
		 this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			PageFactory.initElements(driver, this);
	 }

}

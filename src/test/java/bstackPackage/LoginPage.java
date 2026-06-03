package bstackPackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	WebDriver driver;
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));;
	
	 @FindBy(id="signin") WebElement Signin;//
	 @FindBy(id="username") WebElement userName;
	 @FindBy(xpath="//div[text()='demouser']") WebElement userid;
	 @FindBy(id="password") WebElement pswd;
	 @FindBy(id="login-btn") WebElement LoginBtn;

	 @FindBy(className="h3[class='api-error']") WebElement errMsg;
	 
	 public void UserName() 
		{
		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Click username dropdown
		WebElement userDropdown = wait.until(
		    ExpectedConditions.elementToBeClickable(userName));

		userDropdown.click();

		// Select username option
		wait.until(ExpectedConditions.elementToBeClickable(userid)).click();

				}

	 public void Password()
		{
		 pswd.click();
		 wait.until(ExpectedConditions.elementToBeClickable(
		     By.xpath("//div[text()='testingisfun99']")
		 )).click();
		 	
		}

	 public void Login()
		{
		 wait.until(
				    ExpectedConditions.elementToBeClickable(LoginBtn));
		 LoginBtn.click();
			
		}
	 public void SignIn()
		{
		 Signin.click();
			
		}


	 
	 public LoginPage(WebDriver driver) {
		 this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			PageFactory.initElements(driver, this);
	 }

}

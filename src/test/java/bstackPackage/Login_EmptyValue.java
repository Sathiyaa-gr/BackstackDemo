package bstackPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_EmptyValue {
	 @FindBy(id="signin") WebElement Signin;
	 
	 @FindBy(id="username") WebElement UserName;
	 @FindBy(id="password") WebElement Password;
	 @FindBy(id="login-btn") WebElement LoginBtn;
	 
	 public void UserName(String user)
		{
		 UserName.sendKeys(user);
			
		}

	 public void Password(String pwd)
		{
		 Password.sendKeys(pwd);
			
		}

	
	 
}

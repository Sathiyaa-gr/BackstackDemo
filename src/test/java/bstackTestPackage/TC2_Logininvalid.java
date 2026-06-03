package bstackTestPackage;

import org.testng.annotations.Test;

import bstackPackage.InvalidCredentials;
import bstackPackage.LoginPage;

public class TC2_Logininvalid extends BaseClass{
	
	@Test
	public void InValidLogin() throws InterruptedException {
		 System.out.println(driver.getTitle());
		 InvalidCredentials ln=new InvalidCredentials(driver);
		 LoginPage l=new LoginPage(driver);
		l.SignIn();
		ln.UserName();
		ln.Login();
		ln.Error();
	}
}

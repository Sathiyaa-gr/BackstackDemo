package bstackTestPackage;

import org.testng.annotations.Test;

import bstackPackage.InvalidCredentials;
import bstackPackage.LoginPage;

public class TC3_LoginwithEmpty extends BaseClass{

	@Test
	public void EmptyLogin() {
		
		System.out.println(driver.getTitle());
		InvalidCredentials ln=new InvalidCredentials(driver);
		 LoginPage l=new LoginPage(driver);
		 l.SignIn();
		 ln.Login();
		 ln.Error();
	}
}

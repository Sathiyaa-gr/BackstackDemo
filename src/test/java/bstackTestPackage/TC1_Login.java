package bstackTestPackage;

import org.testng.annotations.Test;

import bstackPackage.LoginPage;

public class TC1_Login extends BaseClass{
	
	@Test
	public void ValidLogin() throws InterruptedException {
		 System.out.println(driver.getTitle());
		LoginPage l=new LoginPage(driver);
		l.SignIn();
		l.UserName();
		l.Password();
		l.Login();
	}
}

package bstackTestPackage;

import org.testng.annotations.Test;

import bstackPackage.LoginPage;
import bstackPackage.MultipleCart;

public class TC5_MultipleAddtoCart extends BaseClass{

	@Test
	public void MultipleCart() {
		
		System.out.println(driver.getTitle());
		//login
		 LoginPage l=new LoginPage(driver);
			l.SignIn();
			l.UserName();
			l.Password();
			l.Login();
		//add multiple cart	
		MultipleCart mul=new MultipleCart(driver);
		mul.cart();
		mul.cart2();
		mul.qty();
		 
	}
}

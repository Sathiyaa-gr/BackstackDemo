package bstackTestPackage;

import org.testng.annotations.Test;

import bstackPackage.LoginPage;
import bstackPackage.SingleCart;

public class TC4_AddtoCart extends BaseClass{

	@Test
	public void AddtoCart() {
		 System.out.println(driver.getTitle());
		 LoginPage l=new LoginPage(driver);
			l.SignIn();
			l.UserName();
			l.Password();
			l.Login();
		
		
		SingleCart single=new SingleCart(driver);
		single.cart();
		 
	
		 
	}
}

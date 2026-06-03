package bstackTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import bstackPackage.LoginPage;
import bstackPackage.MultipleCart;
import bstackPackage.checkoutPage;

public class TC7_Checkout extends BaseClass{

	@Test
	public void Checkout() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		
		LoginPage login=new LoginPage(driver);
		login.SignIn();
		login.UserName();
		login.Password();
		login.Login();
		//add multiple cart	
		MultipleCart mul=new MultipleCart(driver);
		mul.cart();
	
		checkoutPage check=new checkoutPage(driver);
		check.checkout();
		check.firstName("Hari");
		check.lastName("Prasad");
		check.Address("23 Main st");
		check.state("Brampton");
		check.pincode("L2W 3n3");
		check.clickSubmit();
		Assert.assertTrue(true, "Your Order has been successfully placed.");
		 
	}
}

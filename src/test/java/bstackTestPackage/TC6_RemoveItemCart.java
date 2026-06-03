package bstackTestPackage;

import org.testng.annotations.Test;

import bstackPackage.LoginPage;
import bstackPackage.MultipleCart;
import bstackPackage.RemoveItemfromCart;

public class TC6_RemoveItemCart extends BaseClass{

	@Test
	public void RemoveItem() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		
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
		Thread.sleep(2000);;
		RemoveItemfromCart rem=new RemoveItemfromCart(driver);
		rem.deleteCart();
		 
	}
}

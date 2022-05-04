package com.graft;

import org.testng.annotations.Test;

public class AppTest extends BaseTest{

	@Test
	public void Register() throws InterruptedException
	{
		StorePage storePage=new HomePage(driver).
				load().
				navigateToStoreMenuLink().
				search("Blue"); 
		Assert.assertEquals(storePage.getTitle(),"Search result:“Blue Shoes”");

		storePage.clickaddToCartBtn("Blue Shoes");
		Thread.sleep(5000);	
		CartPage cartPage=storePage.clickViewCart();
		Assert.assertEquals(cartPage.getProductName(),"Search result:“Blue Shoes”");
	
	}



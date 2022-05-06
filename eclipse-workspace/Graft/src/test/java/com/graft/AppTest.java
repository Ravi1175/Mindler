package com.graft;

import org.testng.annotations.Test;
import com.graft.base.BaseTest;
import com.graft.pages.UserRegistration;

public class AppTest extends BaseTest{

	@Test
	public void Register() throws InterruptedException
	{
		UserRegistration userRegister=new UserRegistration(driver);
		userRegister.Register();
	}
}


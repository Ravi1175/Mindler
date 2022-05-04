package com.graft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.graft.base.BasePage;

public class UserRegistration extends BasePage{
	private final By FullName=By.xpath("//input[@placeholder='Full Name']");
	private final By EmailId=By.xpath("//input[@type='email']");
	private final By MobileNumber=By.xpath("//input[@id='phone']");
	private final By Password=By.xpath("//input[@id='password']");
	private final By CouponCode=By.xpath("//input[@placeholder='Coupon Code']");
	private final By SubmitBtn=By.xpath("//button[normalize-space()='Sign Up']");

	public UserRegistration(WebDriver driver) {
		super(driver);
	}

	private UserRegistration enterFullName()   
	{
		WebElement fullName = wait.until(ExpectedConditions.visibilityOfElementLocated(FullName));
		fullName.sendKeys(TempFullName);
		return this;
	}

	private UserRegistration enterEmailID()   
	{
		WebElement emailId = wait.until(ExpectedConditions.visibilityOfElementLocated(EmailId));
		emailId.sendKeys(TempEmailId);
		return this;
	}

	private UserRegistration enterMobileNumber()   
	{
		WebElement emailId = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileNumber));
		emailId.sendKeys(TempMobileNumber);
		return this;
	}
	
	private UserRegistration enterPassword()   
	{
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
		password.sendKeys("Admin@123");
		return this;
	}

	private UserRegistration enterCouponCode()   
	{
		WebElement couponCode = wait.until(ExpectedConditions.visibilityOfElementLocated(CouponCode));
		couponCode.sendKeys("gus100");
		return this;
	}

	private UserRegistration clickOnSubmitBtn()   
	{
		driver.findElement(SubmitBtn).click();
		return this;
	}

	public void Register()
	{
		enterFullName();
		enterEmailID();  
		enterMobileNumber();
		enterPassword();
		enterCouponCode();
		clickOnSubmitBtn();	
	}
}

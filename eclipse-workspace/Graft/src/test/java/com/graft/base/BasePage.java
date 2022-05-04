package com.graft.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class BasePage {

	public WebDriver driver;
	protected WebDriverWait wait;

	Faker faker = new Faker();
	protected String TempFirstName = faker.name().firstName();
	protected String TempLastName = faker.name().lastName();
	protected String TempFullName = faker.name().fullName();
	protected String TempMobileNumber = "9"+faker.number().digits(9);
	protected String TempEmailId=TempFirstName+"01@gmail.com";
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	


}

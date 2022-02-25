package com.mindler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;

public class Mindler_Register {

	public void Register(WebDriver driver) throws InterruptedException {

		driver.get("https://www.mindler.com/login");

		// locate the Account field
		WebElement Account = driver.findElement(By.linkText("Create Account"));
		Account.click();

		// Scroll Down
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,300)");

		// Random Name
		Faker faker = new Faker();
		String TempFirstName = faker.name().firstName();
		String TempFullName = faker.name().fullName();
		String TempEmail = TempFirstName + "02@gmail.com";
		String TempNumber = "99" + faker.number().digits(8);

		// Locate Element
		WebElement FullName = driver.findElement(By.id("username"));
		FullName.click();
		FullName.sendKeys(TempFullName);

		WebElement Email = driver.findElement(By.id("email"));
		Email.click();
		Email.sendKeys(TempEmail);

		WebElement MobileNumber = driver.findElement(By.id("mobile-number"));
		MobileNumber.click();
		MobileNumber.sendKeys(TempNumber);

		WebElement Designation = driver.findElement(By.id("designation"));
		Designation.click();

		Select SDesignation = new Select(Designation);
		SDesignation.selectByValue("Student");

		WebElement Submit = driver.findElement(By.id("submitFrm"));
		Submit.click();

		Thread.sleep(3000);

		WebElement Career = driver
				.findElement(By.xpath("//div[@class='for-child-label' and contains(text(),'Choosing my Stream')]"));
		Career.click();

		WebElement StuClass = driver.findElement(By.xpath(
				"//body/section[@id='container']/div[@id='modal-snff']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]"));
		StuClass.click();

		WebElement NextBtn = driver.findElement(By.xpath("//button[@id='btn-next']"));
		NextBtn.click();

		Thread.sleep(3000);
		WebElement City = driver.findElement(By.linkText("Detect Current City"));
		City.click();

		Thread.sleep(1000);
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.click();
		Password.sendKeys("Admin@123");

		WebElement Dashboard = driver.findElement(By.xpath("//button[@id='btn-signup-dashboard']"));
		Dashboard.click();

		Thread.sleep(1000);
		driver.close();

	}

}

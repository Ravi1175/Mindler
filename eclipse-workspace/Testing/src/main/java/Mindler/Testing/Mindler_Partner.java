package Mindler.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import com.github.javafaker.Faker;

public class Mindler_Partner {

	public void Partner(WebDriver driver) throws InterruptedException, Exception {
		
		driver.get("https://cryptogmail.com/");

		// Window Handle
		String Parent = driver.getWindowHandle();
		System.out.println("Parent" + Parent);

		// locate the email field
		WebElement Email = driver.findElement(By.xpath("//div[@class='field--value js-email']"));
		String SEmail = Email.getText();
		System.out.println(SEmail);

		// New Tab
		String ChildTab = driver.getWindowHandle();
		System.out.println("ChildTab" + ChildTab);
		WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);
		newtab.get("https://www.mindler.com/partner");

		Thread.sleep(1000);
		WebElement Registerbtn = driver.findElement(By.xpath("//div[@class='form-row banner-btn-items-1']"));
		Registerbtn.click();

		Thread.sleep(1000);

		Faker faker = new Faker();
		String TempFirstName = faker.name().firstName();
		String TempFullName = faker.name().fullName();
		String TempNumber = faker.number().digits(8);

		WebElement FullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		WebElement PhoneNumber = driver.findElement(By.xpath("//input[@placeholder='081234 56789']"));
		WebElement EmailId = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Create Password']"));
		WebElement BrandName = driver.findElement(By.xpath("//input[@placeholder='Brand Name']"));
		WebElement NextBtn = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));

		FullName.sendKeys(TempFirstName);
		PhoneNumber.sendKeys("99" + TempNumber);
		EmailId.sendKeys(SEmail);
		Password.sendKeys("Admin@123");
		BrandName.sendKeys(TempFullName);
		NextBtn.click();

		Thread.sleep(2000);
		WebElement SiteAddress = driver.findElement(By.xpath("//input[@placeholder='Site address']"));
		//WebElement UploadLogo = driver.findElement(By.xpath("//a[contains(text(),'Upload Logo')]"));
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));

		SiteAddress.click();
		SiteAddress.sendKeys(TempFirstName + faker.number().digits(4));
		//UploadLogo.click();
		//Thread.sleep(5000);
		//Runtime.getRuntime().exec("C:\\Users\\Taxmann Technologies\\Documents\\AutoIT\\Open.exe");
		//Thread.sleep(5000);
		SubmitBtn.click();

		Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(text(),'Resend Verification Email')]")).click();
		driver.close();

		driver.switchTo().window(Parent);
		Thread.sleep(3000);
        
		driver.findElement(By.xpath("//a[@class='temp-mail__button button button--refresh']")).click();;
		Thread.sleep(1000);

		// ScrollBar
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[contains(text(),'partner@mindler.com')]")).click();
		Thread.sleep(1000);
		
		//ScrollBar
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Confirm Email Address')]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}

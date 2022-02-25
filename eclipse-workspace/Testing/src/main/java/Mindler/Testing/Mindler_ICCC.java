package Mindler.Testing;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mindler_ICCC {

	public void ICCC(WebDriver driver) throws InterruptedException {

		driver.get("https://www.mindler.com/iccc");

		// Random First_Name,Last_Name and Email Id
		Faker faker = new Faker();
		String TempFirstName = faker.name().firstName();
		String TempLastName = faker.name().lastName();
		String TempNumber = faker.number().digits(8);

		driver.findElement(By.xpath("//input[contains(@class,'header__login-input ng-untouched')]"))
				.sendKeys(TempFirstName + "01@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(TempFirstName);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(TempLastName);
		driver.findElement(By.xpath("//input[@id='userPhone']")).sendKeys("99" + TempNumber);
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(TempFirstName + "@123");
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Select your Gender')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//input[@id='userDob']")).sendKeys("02-02-1994");
		driver.findElement(By.xpath("//span[contains(text(),'Select your City')]")).click();

		WebElement SCity = driver.findElement(By.xpath(
				"/html/body/app-root/div/app-iccc/app-iccc-base-page/div/div/app-iccc-foundation/div/div[2]/div[3]/form/div[1]/div[6]/div/p-dropdown/div/div[3]/div[1]/div/input"));
		SCity.click();
		SCity.sendKeys("Delhi");
		WebElement SClick = driver.findElement(By.xpath(
				"/html/body/app-root/div/app-iccc/app-iccc-base-page/div/div/app-iccc-foundation/div/div[2]/div[3]/form/div[1]/div[6]/div/p-dropdown/div/div[3]/div[2]/ul/cdk-virtual-scroll-viewport/div[1]/p-dropdownitem[2]/li"));
		SClick.click();

		driver.findElement(By.xpath("//input[@id='whatsapp-alert-1']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'Continue')]")));

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='cohort-54']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Select your experience')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper ng-tns-c47-1')]/ul//li[contains(@aria-label,'less than 5')]")).click();

	    driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-iccc[1]/app-iccc-base-page[1]/div[1]/div[1]/app-iccc-foundation[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[2]/div[1]/p-dropdown[1]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper')]/ul//li[contains(@aria-label,'Yes')]")).click();;
	    
		driver.findElement(By.xpath("//input[@formcontrolname='organization']")).sendKeys("Mindler");
		
	    driver.findElement(By.xpath("//div[@class='ng-tns-c47-19 p-dropdown p-component form__input form__input--fw']")).click();
	    driver.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper')]/ul//li[contains(@aria-label,'Teacher')]")).click();
	    
		driver.findElement(By.xpath("//span[@class='ng-tns-c47-20 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']")).click();
		Thread.sleep(3000);
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper')]/ul//li[contains(@aria-label,'School')]"))).click();
		
	    driver.findElement(By.xpath("//input[@formcontrolname='linkedin_profile_url']")).sendKeys("https://www.linkedin.com/in/ravi-kushwah/");
		driver.findElement(By.xpath("//input[@name='institute-name']")).sendKeys("IGNOU");
		
	    driver.findElement(By.xpath("//div[@class='ng-tns-c47-21 form__input form__input--fw p-dropdown p-component']")).click();
	    driver.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper')]/ul//li[contains(@aria-label,'Masters')]")).click();
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Select Field')]")).click();
	    driver.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper')]/ul//li[contains(@aria-label,'Design')]")).click();
	    
		driver.findElement(By.xpath("//div[@class='ng-tns-c47-23 form__input form__input--fw p-dropdown p-component']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper')]/ul//li[contains(@aria-label,'2014')]")).click();

		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)"); // Scrolling the window by 200 pixels vertically
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='prior_experience-1']")).click();
		driver.findElement(By.xpath("//textarea[contains(@formcontrolname,'answer_2')]")).sendKeys(
				"Attract jobs and target opportunities in the rapidly growing and in-demand field of career counselling."
						+ "Attract jobs and target opportunities in the rapidly growing and in-demand field of career counselling."
						+ "Attract jobs and target opportunities in the rapidly growing and in-demand field of career counselling."
						+ "Attract jobs and target opportunities in the rapidly growing and in-demand field of career counselling.");

		driver.findElement(By.xpath("//textarea[contains(@formcontrolname,'answer_3')]")).sendKeys(
				"Attract jobs and target opportunities in the rapidly growing and in-demand field of career counselling."
						+ "Attract jobs and target opportunities in the rapidly growing and in-demand field of career counselling."
						+ "Attract jobs and target opportunities in the rapidly growing and in-demand field of career counselling."
						+ "Attract jobs and target opportunities in the rapidly growing and in-demand field of career counselling.");

		driver.findElement(By.xpath("//button[@class='btn btn--light-orange form__button-rad']")).click();

		Thread.sleep(2000);
		driver.close();

	}
}

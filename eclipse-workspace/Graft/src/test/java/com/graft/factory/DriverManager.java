package com.graft.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public WebDriver initializeDriver()
	{
		//WebDriverManager.chromedriver().cachePath("Drivers").setup();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"+"\\Drivers\\chromedriver.exe"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gusqa.mindler.com/");
		return driver;
   
	}

}

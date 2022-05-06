package com.graft.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public WebDriver initializeDriver()
	{
		WebDriverManager.chromedriver().cachePath("Drivers").setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gusqa.mindler.com/");
		return driver;
   
	}

}

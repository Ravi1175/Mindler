package Mindler.Testing;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MindlerScript {
	
	WebDriver driver = null;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test (priority=2)	
	public void MindlerICCC() {
		Mindler_ICCC mi = new Mindler_ICCC();
		try {
			mi.ICCC(driver);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=3)	
	public void MindlerRegister() {
		Mindler_Register mi = new Mindler_Register();
		try {
			mi.Register(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=2)
	public void MindlerPartner() {
		Mindler_Partner mp=new Mindler_Partner();
		try {
			mp.Partner(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

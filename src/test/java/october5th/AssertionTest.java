package october5th;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest {
		
		@Test
		private void tc1() {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		
			String url = driver.getCurrentUrl();
			
			//Hard Assert
			//Assert.assertEquals(url, "https://www.facebook");
			
			//Soft Assert
			SoftAssert s = new SoftAssert();
			s.assertEquals(url, "https://www.facebook");
			
			System.out.println(driver.getTitle());
			s.assertAll();

		
	}
		@Test
		private void tc2() {
			
			
			System.out.println("complete");
			
			
		}

}

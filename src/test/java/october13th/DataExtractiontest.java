package october13th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataExtractiontest {
	
	@Test(dataProvider = "loginData")
	private void tc1(String user, String pass) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}

	@DataProvider(name = "loginData")
	public Object[][] login() {
		Object[][] data = new Object[2][2];
		data[0][0] = "java";
		data[0][1] = "1234";

		data[1][0] = "Selenium";
		data[1][1] = "12353";
		return data;

	}

}

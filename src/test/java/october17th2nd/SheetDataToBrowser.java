package october17th2nd;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import october17th.Base1;

public class SheetDataToBrowser extends Base1 {
	@Test
	private void tc1() throws IOException {
		browserLaunch("https://www.facebook.com/");

		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys(StringData(0, 0));
		driver.findElement(By.id("pass")).sendKeys("12345");
	}

}

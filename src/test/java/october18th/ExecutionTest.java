package october18th;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExecutionTest extends ExcelDataToSelenium{
	@Test
	private void tc1() throws IOException {
		browserLaunch("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(StringData(0, 0));
		driver.findElement(By.id("pass")).sendKeys(numericData(1, 0));
	}

}

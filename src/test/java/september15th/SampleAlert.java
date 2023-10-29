package september15th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleAlert {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

//		WebElement simpleAlert = driver.findElement(By.id("alertButton"));
//		simpleAlert.click();
		
		WebElement confirm = driver.findElement(By.id("confirmButton"));
		confirm.click();

//		Alert a = driver.switchTo().alert();
//		a.accept();
		
//		a.dismiss();

	}

}

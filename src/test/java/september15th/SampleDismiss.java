package september15th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleDismiss {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']"));
		WebElement first = driver.findElement(By.id("alertButton"));
		first.click();

		Alert a = driver.switchTo().alert();
		a.accept();

//		WebElement second = driver.findElement(By.id("timerAlertButton"));
//		second.click();

//		Alert b = driver.switchTo().alert();
		Thread.sleep(3000);
//		b.accept();

		WebElement confirmButton = driver.findElement(By.id("confirmButton"));

		confirmButton.click();

		Alert c = driver.switchTo().alert();
		c.dismiss();
	}

}

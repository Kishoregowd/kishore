package september14th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class September9thActions {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement link = driver.findElement(By.xpath("//a[text()='Create a Page']"));

		Thread.sleep(3000);

		Actions a = new Actions(driver);

		a.moveToElement(link).perform();
		a.contextClick(link).perform();
		
		
	}

}

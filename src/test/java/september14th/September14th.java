package september14th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class September14th {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement text = driver.findElement(
				By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String fbtext = text.getText();
		System.out.println(fbtext);

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("12345");

		String value = user.getAttribute("value");
		System.out.println(value);
	}

}

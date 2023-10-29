package september29th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		// driver.switchTo().frame("login_page");
		//driver.switchTo().frame(0);
		WebElement login = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(login);

		WebElement browser = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		browser.sendKeys("Besant");

	}

}

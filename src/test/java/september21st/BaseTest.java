package september21st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static WebDriver driver;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void printTitle() {
		System.out.println(driver.getTitle());

	}

	public static void printUrl() {
		System.out.println(driver.getCurrentUrl());

	}

	public static void quitBrowser() {
		driver.quit();
	}

}

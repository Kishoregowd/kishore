package october20th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total Link Count - "+links.size());
		for (WebElement w :links) {
			String url = w.getAttribute("href");
			System.out.println(url);

		}

	}

}

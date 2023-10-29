package october12th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionTest {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("che");
		Thread.sleep(3000);
		
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//*[@class='G43f7e']//li"));
		
		int size = autoSuggestion.size();
		System.out.println(size);
		
		autoSuggestion.get(size - 1).click();
		
		
	}

}

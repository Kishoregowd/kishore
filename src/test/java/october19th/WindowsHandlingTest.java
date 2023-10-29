package october19th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlingTest {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> AllwindowHandles = driver.getWindowHandles();
		System.out.println(AllwindowHandles);

		for (String s : AllwindowHandles) {
			if (!s.equals(windowHandle)) {
				driver.switchTo().window(s);
				driver.findElement(By.id("firstName")).sendKeys("Besant");
				Thread.sleep(2000);
				driver.close();
			}

		}
		driver.switchTo().window(windowHandle);
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Besant");
	}

}

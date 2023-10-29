package september15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("abinesh12345");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		Thread.sleep(2000);
		WebElement loc = driver.findElement(By.id("location"));
		loc.click();
		
		/*
		 * Select s = new Select(loc); s.selectByVisibleText("London");
		 */

		/*
		 * WebElement htl = driver.findElement(By.id("hotels")); Select ht = new
		 * Select(htl); ht.selectByValue("Hotel Sunshine");
		 * 
		 * WebElement roomType = driver.findElement(By.id("room_type")); Select room=new
		 * Select(roomType); room.selectByValue("Double");
		 * 
		 * WebElement roomNo = driver.findElement(By.id("room_nos")); Select rn = new
		 * Select(roomNo); rn.selectByValue("4");
		 * 
		 * WebElement adultRoom = driver.findElement(By.id("adult_room")); Select ar =
		 * new Select(adultRoom); ar.selectByValue("3");
		 * 
		 * WebElement childRoom = driver.findElement(By.id("child_room")); Select cr =
		 * new Select(childRoom); cr.selectByValue("2");
		 * 
		 * WebElement search = driver.findElement(By.id("Submit")); search.click();
		 */		
		
		
	}

}

package october20th;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImage {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();

		List<WebElement> imageTag = driver.findElements(By.tagName("img"));
		System.out.println(imageTag.size());

		for (WebElement w : imageTag) {
			String attribute = w.getAttribute("src");

			URL url = new URL(attribute);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(attribute + "- " + httpURLConnection.getResponseMessage());

			} else {
				System.out.println(attribute + "-" + httpURLConnection.getResponseCode() + "-"
						+ httpURLConnection.getResponseMessage());

			}
		}

	}

}

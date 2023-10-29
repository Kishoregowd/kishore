package october20th;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.hc.client5.http.classic.methods.HttpUriRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksList {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (WebElement w : links) {
			String linkUrl = w.getAttribute("href");

			URL url = new URL(linkUrl);
			URLConnection urlConnection = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(linkUrl + "-" + httpURLConnection.getResponseMessage());

			} else {
				System.err.println(linkUrl + "-" + httpURLConnection.getResponseCode() + "-"
						+ httpURLConnection.getResponseMessage());

			}

		}

	}

}

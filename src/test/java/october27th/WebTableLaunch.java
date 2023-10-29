package october27th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableLaunch extends WebtableBase {
	public static void main(String[] args) {
		browserLaunch();

		List<WebElement> allHeader = driver.findElements(By.xpath("//*[@id='customers']//th"));
		for (WebElement w : allHeader) {
			String text = w.getText();
			System.out.println(text);
		}
	}

}

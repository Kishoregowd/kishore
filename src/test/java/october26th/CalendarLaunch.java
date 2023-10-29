package october26th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalendarLaunch extends CalendarBase {
	public static void main(String[] args) {
		browserLaunch();
		maximize();
		
		String year = "2023";
		String month = "December";
		String date = "15";

		driver.findElement(By.id("datepicker")).click();
		;

		while (true) {
			WebElement title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
			String monthYear = title.getText();
			String split[] = monthYear.split(" ");
			String mon = split[0];
			String yr = split[1];
			if (mon.equals(month) && yr.equals(year)) {
				break;

			} else {
				driver.findElement(By.xpath("//*[text()='Next']")).click();
			}
		}
		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//td"));
		for (WebElement w : dates) {
			String text = w.getText();
			if (text.equals(date)) {
				w.click();
				break;
			}
		}

	}
}

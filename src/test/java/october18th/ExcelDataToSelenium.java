package october18th;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataToSelenium {
	
	public static WebDriver driver;
	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static String StringData(int row, int cell) throws IOException {
		File loc = new File("C:\\Users\\kishormz\\eclipse-workspace\\MavenProject\\src\\test\\resources\\testdata\\demo.xlsx");
		FileInputStream input = new FileInputStream(loc);
		
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("online");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}
	public static String numericData(int row, int cell) throws IOException {
		File loc = new File("C:\\Users\\kishormz\\eclipse-workspace\\MavenProject\\src\\test\\resources\\testdata\\demo.xlsx");
		FileInputStream input = new FileInputStream(loc);
		
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("online");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double d = c.getNumericCellValue();
		long l = (long)d;
		String valueOf = String.valueOf(l);
		return valueOf;
	}
	public static void maximizeScreem() {
		driver.manage().window().maximize();
	}
	

}

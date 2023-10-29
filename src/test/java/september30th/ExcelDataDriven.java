package september30th;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
	public static void main(String[] args) throws IOException {

		File loc = new File(
				"C:\\Users\\kishormz\\eclipse-workspace\\MavenProject\\src\\test\\resources\\testdata\\Besant.xlsx");
		FileInputStream input = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("selenium");
		
		// Row r = s.getRow(0);
		// Cell c = r.getCell(0);
		// System.out.println(c);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);

			}

		}
	}

}

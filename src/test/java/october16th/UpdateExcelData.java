package october16th;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcelData {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\kishormz\\eclipse-workspace\\MavenProject\\src\\test\\resources\\testdata\\demo.xlsx");
		FileInputStream input = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("online");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String s1 = c.getStringCellValue();
		if(s1.equals("selenium")) {
			c.setCellValue("oracle");
			
		}
		FileOutputStream output = new FileOutputStream(loc);
		w.write(output);
		System.out.println("done");
		
		
		
	}

}

package september30th;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataCreate {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\kishormz\\eclipse-workspace\\MavenProject\\src\\test\\resources\\testdata\\Besant.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet();
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("JavaBatch");
		
		FileOutputStream output = new FileOutputStream(loc);
		w.write(output);
System.out.println("It's done");		
	}


}

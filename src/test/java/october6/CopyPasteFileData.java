package october6;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class CopyPasteFileData {
	public static void main(String[] args) throws IOException {
		
		//File f = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		//FileUtils.write(f, "Hi all");
		//System.out.println("it's Done");
		
		//File f1 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		//List<String> read = FileUtils.readLines(f1);
		//for (String s : read) {
		//System.out.println(s);
		//}
		
		File f2 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		File f3 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\Bye.txt");

		FileUtils.copyFile(f2, f3);
		List<String> read = FileUtils.readLines(f3);
		for (String s : read) {
		System.out.println(s);
		}
	}

}

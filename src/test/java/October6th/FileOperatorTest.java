package October6th;

import java.io.File;
import java.io.IOException;

public class FileOperatorTest {
	public static void main(String[] args) throws IOException {
		//File f = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training");
		//boolean b = f.mkdir();
		//System.out.println(b);
		
		File f1 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		boolean b1 = f1.createNewFile();
		System.out.println(b1);
		
		File f2 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		boolean b2 = f2.canRead();
		System.out.println(b2);
		
		File f3 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		boolean b3 = f3.canWrite();
		System.out.println(b3);

		File f4 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		boolean b4 = f4.canExecute();
		System.out.println(b4);
		
		File f5 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		boolean b5 = f5.exists();
		System.out.println(b5);
		
		File f6 = new File("C:\\Users\\kishormz\\Downloads\\Besant\\Training\\hello.txt");
		boolean b6 = f6.isHidden();
		System.out.println(b6);

		


	}

}

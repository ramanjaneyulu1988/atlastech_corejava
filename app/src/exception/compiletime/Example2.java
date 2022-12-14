package exception.compiletime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/files123"); // Creating Object for file class
		FileWriter fileWriter = null;
		String s = null;
		try {
			System.out.println("Opening connection...");
			int k = 10/0;
			int len = s.length();
			fileWriter = new FileWriter(file+"/empnames.txt"); // opening connection for FileWriter
			fileWriter.write("Ram\nRajesh\nRakesh\nAlex\nRaj"); // We are writing data into the file
			fileWriter.flush(); // flush is equal to in database commit (This is kind of giving permission)
		} 
		finally
		{
			try {
				System.out.println("closing connection...");
				fileWriter.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("main method end...");
	}
}

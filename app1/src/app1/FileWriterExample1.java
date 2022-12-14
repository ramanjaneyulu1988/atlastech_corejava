package app1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		
		File file = new File("D:/files");
		
		FileWriter fw = new FileWriter(file+"/abc.csv");
		
		sb.append("Bangalore");
		sb.append(",");
		sb.append("Hyderabad");
		
		fw.write(sb.toString());
		
		sb = new StringBuilder();
		sb.append("\n");
		sb.append("Chennai");
		sb.append(",");
		sb.append("Vizag");
		
		fw.write(sb.toString());
		
		fw.flush();
		
		System.out.println("done");
		
	}
}

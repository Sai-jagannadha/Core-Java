package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class TextFileCreating {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\saija_bewaxlr\\Documents\\Filehandling Java\\sample.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Sai Bhavya Harika");
		bw.newLine();
		bw.write("Writer");
		System.out.println("File created..");
		bw.close();
	}
}
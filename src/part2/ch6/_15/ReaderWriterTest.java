package part2.ch6._15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterTest {
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("part2/ch6/input.txt");
		
		int i = 0;
		while((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		
		FileWriter writer = new FileWriter("part2/ch6/output2.txt", true);
		writer.append('\n');
		writer.append('H');
		writer.append('E');
		writer.append('L');
		writer.append('L');
		writer.append('O');
		writer.flush();
		
		System.out.println("==========================================");
		FileReader reader2 = new FileReader("part2/ch6/output2.txt");
		
		int j = 0;
		while((j = reader2.read()) != -1) {
			System.out.print((char)j);
		}
	}
}

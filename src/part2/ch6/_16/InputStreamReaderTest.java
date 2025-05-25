package part2.ch6._16;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	
	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("part2/ch6/input.txt"))) {
			
			int i;
			
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

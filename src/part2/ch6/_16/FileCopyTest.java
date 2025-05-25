package part2.ch6._16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
	
	public static void main(String[] args) {
		
		long milliseconds = 0;
		
		try {
			FileInputStream fis = new FileInputStream("part2/ch6/input.txt");
			FileOutputStream fos = new FileOutputStream("part2/ch6/input_copy.txt");
			
			int i;
			
			milliseconds = System.currentTimeMillis();
			
			while((i=fis.read()) != -1) {
				fos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(milliseconds + " 소요되었습니다.");
	}
}

package part2.ch6._18;

import java.io.File;
import java.io.IOException;

public class FilTest {
	
	public static void main(String[] args) {
		File file = new File("part2/ch6/newFile.txt");
		
		try {
			file.createNewFile(); // 파일 생성
			
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getPath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

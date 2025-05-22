package part2.ch6._14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("part2/ch6/output2.txt", true);
			
			byte[] charList = new byte[10];
			
			for(int i = 0; i < charList.length; i++) {
				charList[i] = (byte)(i + 65);
			}
			
			//버퍼를 통쨰로 파일에 쓰기!
			fos.write(charList);
			
			//버퍼를 실제로 파일에 저장
			fos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fos.close();
		}
	}
}

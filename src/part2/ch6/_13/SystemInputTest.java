package part2.ch6._13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInputTest {
	
	public static void main(String[] args) {
		
		/**
		 * 문자 하나씩 입출력 (Byte 단위 - 1Btye)
		 * */
		int i;
		
		try {
			System.out.println("#### Byte Stream (1Byte씩 읽음) ####");
			System.out.print("입력 : ");
			while((i = System.in.read()) != '\n') { // in -> InputStream -> 1byte씩 읽음
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		 * 문자 하나씩 입출력 (문자 단위 - 2Byte)
		 * */
		
		System.out.println("#### 문자 Stream (2byte씩 읽음) ####");
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			int j;
			System.out.print("입력 : ");
			while((j = isr.read()) != '\n') {
				System.out.print((char)j);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

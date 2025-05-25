package part2.ch6._20;

class MyThread extends Thread {
	public void run() {
		for(int i = 0; i < 200; i++) {
			System.out.print((i+1) + " ");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " : start! ");
		
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		// 두 스레드가 서로 번갈아 가면서 병렬로 실행됨 (따라서 숫자가 순차적으로 출력되지 않음)
		// 출력 결과 -> (1 2 3 4 5 6 1 7 8 2 9 3 10 4 5 6 7 8 9 10 11 11...)
		thread1.start(); 
		thread2.start();
		
		System.out.println(Thread.currentThread().getName() + " : end! ");
	}
}
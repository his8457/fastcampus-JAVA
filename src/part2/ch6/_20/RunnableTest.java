package part2.ch6._20;

class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print((i+1) + " ");
		}
		System.out.println();
	}
}

public class RunnableTest {
	public static void main(String[] args) {
		System.out.println("=============== Runnable 구현체 클래스 ===============");
		System.out.println(Thread.currentThread() + " start!");
		
		MyRunnableThread runnableThread = new MyRunnableThread();
		
		Thread thread1 = new Thread(runnableThread);
		//Thread thread2 = new Thread(runnableThread);
		
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//thread2.start();
		
		System.out.println(Thread.currentThread() + " end!\n");
		
		System.out.println("=============== 익명 클래스 ===============");
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명 클래스 : Runnable!");
			}
		};
		
		Thread thread3 = new Thread(r);
		thread3.start();
	}
}

package part4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		//스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task2()); //task발생시 에러발생 -> thread 종료
		executorService.submit(()->{ //task발생시 에러발생 -> thread 종료x , 재사용가능
			for(int i=0; i<100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}

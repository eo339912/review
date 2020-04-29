package part4;

/*
 * thread 클래스
*/
public class MutiThreadTest {
	public static void main(String[] args) {
		Task1 task1 = new Task1();
		task1.start();
		
		Task2 task2 = new Task2();
		Thread thread2 = new Thread(task2);
		thread2.start();
		
		for(int i=10000; i<10100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Thread thread4 = new Thread(new Runnable() {
			public void run() {
				for(int i=20000; i<20100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		thread4.start();
		
		Thread thread5 = new Thread(()-> {
			for(int i=30000; i<30100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread5.start();
	}
}

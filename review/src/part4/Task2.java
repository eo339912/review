package part4;

public class Task2 implements Runnable{
	public void run() {
		for(int i=1000; i<1100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

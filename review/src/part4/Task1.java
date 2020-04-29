package part4;

public class Task1 extends Thread{
	public void run() {
		synchronized(this) {
			System.out.println(this.getName());
			for(int i=0; i<800; i++) {
				System.out.print(i + " ");
				if(i%100==0) {
					System.out.println("");
				}
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}			
		}
	}
}

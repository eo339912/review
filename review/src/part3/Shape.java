package part3;

public class Shape {//추상메소드가 하나 : 추상클래스 (abstract)
	 public static String brand = "yedam";
	 protected int startx; //protected -> 다른클래스에서 상속가능
	 protected int starty;
	 protected int color;
	 protected int width;
	 public void setStartx(int startx) {
		this.startx = startx;
	}

	public void setStarty(int starty) {
		this.starty = starty;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	//public abstract double area(); //추상메소드 (abstract)
	 public double area() {return 0;};
	 
	 public Shape() {
		 System.out.println("shape 생성자");
	 }
	 public Shape(int startx, int starty) { //생성자 리턴타입이 없음
		 this.startx = startx;
		 this.starty = starty;
	 }
}

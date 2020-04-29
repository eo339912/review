package part3Test;

import part3.Movable;
import part3.Shape;

//Shape 상속, Movable 상속
public class Rect extends Shape implements Movable{
	//endx, endy, 생성자
	private int endx;
	private int endy;
		
	public Rect() {
		super();
	}

	public Rect(int startx, int starty, int endx, int endy) {
		super(startx, starty);
		this.endx = endx;
		this.endy = endy;
	}

	@Override
	public void move() {
		System.out.println("Rect move");
	}
	
	public int getEndx() {
		return endx;
	}

	public void setEndx(int endx) {
		this.endx = endx;
	}

	public int getEndy() {
		return endy;
	}

	public void setEndy(int endy) {
		this.endy = endy;
	}

	@Override
	public double area() {
		System.out.println("rect area");
		return 0;
	}
	
	
}

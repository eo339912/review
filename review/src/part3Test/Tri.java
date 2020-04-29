package part3Test;

import part3.Drawable;
import part3.Shape;

//Shape 상속, Drawable 상속
public class Tri extends Shape implements Drawable{
	//endx, endy, 생성자
	private int endx;
	private int endy;
	
	
	
	public Tri() {
		super();
	}

	public Tri(int startx, int starty, int endx, int endy) {
		super(startx, starty);
		this.endx = endx;
		this.endy = endy;
	}

	@Override
	public void drow() {
		System.out.println("Tri draw");
	}

	@Override
	public double area() {
		return 0;
	}
	
}

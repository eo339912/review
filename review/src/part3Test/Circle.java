package part3Test;

import part3.Drawable;
import part3.Movable;
import part3.Shape;

public class Circle extends Shape implements Drawable, Movable{ 
	//추상메소드를 상속받으면 오버라이딩 해줘야한다. -> 관계성을 준다. 
	//추상클레스는 다중상속이 불가능하다.(extends Shape)
	//인터페이스는 다중상속이 가능하다.(implements Drawable, Movable{)
	
	private int radius;
	public Circle() {//생성자	 클레스이름과 동일
		super();  //부모의 생성자 (기본생성자)를 호출하기때문에 부모생성자에 생성자를 추가해줄때 기본생성자도 함께 만들어줘야된다.
		//super(0, 0); //부모의 생성자가 추가되면 super에 해당인수를 넣어준다.
	}; 
	public Circle(int startx, int starty, int radius) {
		super(startx, starty);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		System.out.println("circle area");
		return 0;
	}

	@Override
	public void move() {
		System.out.println("circle move");
	}

	@Override
	public void drow() {
		System.out.println("circle drow");		
	}

}

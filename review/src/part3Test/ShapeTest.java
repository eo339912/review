package part3Test;

import java.util.ArrayList;

import part3.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		System.out.println(Shape.brand);
		Shape.brand = "samsung";
		Circle circle = new Circle();
		circle.brand = "rara";
		System.out.println(circle.brand);
		Rect rect = new Rect();
		System.out.println(rect.brand);
		
		//다형성 : 실행결과가 여러가지 결과로 나옴
		//1. 부모타입의 참조변수가 자식 객체를 참조할 수 있다.
		//2. 메서드 실행 시 참조하는 객체의 메서드 호출
		Shape s = new Circle(); 
//		Circle c = new Shape();
		s.area();
		int r = ((Circle)s).getRadius();
		s = new Rect();
		s.area();
		
		ArrayList<Shape> list = new ArrayList<>();
		list.add(new Circle());
		list.add(new Rect());
		list.add(new Tri());
		for(Shape temp : list) {
			temp.area();
		}
		
		
	}
}

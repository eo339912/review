package part1;

public class OperatorTest {
	public static void main(String[] args) {
		//증감
		int a = 5;
		int b = 10;
		int c = a++ + ++b;
		System.out.println(a +", "+ b +", "+ c);
		System.out.println(String.format("%d,%3d,%3d", a, b, c));
		
		//논리(&& || !) and or not a가 10~20인지 검사
		boolean d = a >= 10 && a <= 20;
		System.out.println("논리연산 : " + d);
		
		boolean d2 = a <= 10 || a >= 20;
		System.out.println("논리연산 : " + d2);
		d2 = !(a >= 10 && a <= 20);
		System.out.println("논리연산 : " + d2);
		
//		boolean d3 = (a >= 10 && a <= 20) && (b>=10 && b <= 20);
		boolean d3 = a <= b && a>=10 && b <= 20;
		System.out.println("논리연산 : " + d3);
		
		Integer inta = 5;
		Integer intb = null;
		boolean b1 = inta>=10 && intb>=30;
		System.out.println(b1);
	}
}

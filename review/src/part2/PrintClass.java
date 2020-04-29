package part2;
//1. 클래스 정의
public class PrintClass {
	public static void print() {
		for(int i = 0; i<20; i++) {
			System.out.print("=");
		}
		System.out.println("");
	}
	
	//인수가 한개인 메소드 -> 타입만다른 메소드 : 오버로딩
	public static void print(String shape) {
		for(int i = 0; i<20; i++) {
			System.out.print(shape);
		}
		System.out.println("");
	}
	
	//인수가 두개인 메소드 -> 타입만다른 메소드 : 오버로딩
		public static void print(String shape, int length) {
			for(int i = 0; i<length; i++) {
				System.out.print(shape);
			}
			System.out.println("");
		}
}

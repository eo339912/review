package part2;

public class SumClass {
	public static int total(int ... arr) {
//		int c = a+b;
		int c = 0;
//		for(int a : arr) {
//			c += a; 
//		}
		
		for(int i =0; i <arr.length; i++) {
			c += arr[i];
		}
		return c;
	}
}

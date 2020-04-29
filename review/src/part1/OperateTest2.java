package part1;

public class OperateTest2 {
	public static void main(String[] args) {
		
		//삼항연산
		int score = 80;
		String grade = score >= 60? "succes":"fail";
		System.out.println(grade);
		boolean booleangrade = score >= 60? true : false;
		System.out.println(booleangrade);
		
		char chargrade = score >= 90? 'a' : (score>=80 ? 'b' : 'c');
		System.out.println(chargrade);
		
		int a = 5 + 6 + 7;
		int b, c;
		a = b = c = 10; //증감, 대입 연산자는 오른쪽에서 시작
		
		a = 0;
		b = a++ + ++a + ++a + a++ + ++a; //단항연산먼저
		//			1	2			3
		//	3		4	6	10(4)	13
		System.out.println(a);
		System.out.println(c);
		
		a = 0;
		c = a++ - ++a - ++a + a++ - ++a;
		//			1	2			3
		//	3		2	0		4
		System.out.println(a);
		System.out.println(c);
	}
}

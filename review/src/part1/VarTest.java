package part1;
/*
 *데이터 타입, 상수타입 
*/
public class VarTest {
	public static void main(String[] args) {
		// 정수형 진수
		char ch = '\uac00'; //0xAX00, 44032, 가, 
		System.out.println((int)'\uac00');
		int num1 = 0x10;	//16진수
		int num2 = 010;		//8진수
		int num3 = 10;		//10진수
		System.out.println(String.format("%5d %5d %5d", num1, num2, num3));
		
		//기본 데이터형 : 8가지 byte, short, int, long,
		//				float(소수점 6자리, 7자리반올림), double(대정밀도, 소수점 15자리),
		//				boolean, char
		System.out.println(Byte.MAX_VALUE); // byte의 최대값
		System.out.println(Short.MAX_VALUE); // short의 최대값
		System.out.println(Integer.MAX_VALUE); // integer의 최대값
		System.out.println(Long.MAX_VALUE); // long의 최대값
		//-> 단위 맞춰서 값을 넣어줘야함 : overflow방지
		//BigDecimal -> long보다 큰 값
		
		//실수 -> 유효자리
		//0.00001(1*10^-6) 100000(1*10^6) : 같은 유효자리 수를 가진다.
		//0.12345678 = 1.2345678*10^-7
		float fnum = 0.123456789f; //7자리, 8자리 반올림
		System.out.println(fnum);
		double dnum = 0.12345678912345678; // 15자리
		System.out.println(dnum);
		
		//char -> 유니코드
		char c = '가';
		System.out.println(c);
		System.out.println((int)c);
		System.out.println(Integer.toHexString(c)); //16진수
		
		char c1 = '\uac00';
		System.out.println(c1);
		
		//65  97
		char c2 = 'A';
		System.out.println(c2);
		System.out.println((int)c2);
		System.out.println((char)(c2+32)); //소문자값
		
		for(int i=0; i<127; i++) {
			System.out.println(i + "\t" +(char)i);
		}
		
		//상수 타입
		//int double
		long lnum = 10000000000000l;
		float f = 0.123456789f;
		
	}
}

package part2;

import java.util.Calendar;
import java.util.Date;

public class TestClass {
	public static void main(String[] args) {
		//인수와 리턴값이 없는 클래스
		//2. 객체생성
		PrintClass px = new PrintClass();
		px.print(); //3. 연산자 필드나 메스드 호출
		
		//객체생성x : 클래스를 static으로 지정해주면 인스턴스를 만들지 x
		PrintClass.print(); //3. 연산자 필드나 메스드 호출
		
		/////
		
		//인수가 있는 클래스
		PrintClass.print("*");
		
		//인수가 두개 있는 클래스
		PrintClass.print("+" , 2);
		
		/////
		//리턴값이 있는 클래스
		int num1 = 10;
		int num2 = 20;
		int result = SumClass.total(num1, num2);
		System.out.println(result);
		
		result = SumClass.total(1, 2, 3, 4);
		System.out.println(result);
		
		//오늘 날짜를 y/m/d 스트링 리턴
		
		String today = DateUtil.today();
		System.out.println(today);
		
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(2000, 12, 25);
		String birth = DateUtil.strDate(birthDay.getTime());
		String birth2 = DateUtil.strDate(birthDay.getTime(), "yyyy/MM");
		System.out.println(birth);
		System.out.println(birth2);
	}
}

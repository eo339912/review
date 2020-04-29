package review.wrap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeTest {

	public static void main(String[] args) throws ParseException{
		//1. int -> string
		int num = 14;
		String str = Integer.toString(num);
		str = num + "";
		System.out.println("16진수 : " + Integer.toHexString(num));
		
		//2. Double - > String
		double dnum = 4.13;
		str = Double.toString(dnum);
		str = dnum + "";
		System.out.println("double : " + str);
		
		
		//3. String -> int
		String snum = "1010";
		num = Integer.parseInt(snum);
		
		//4. String -> double
		dnum = Double.parseDouble(snum);
		System.out.println("double : " + dnum);
		
		//5. String -> Double
		Double dobj = Double.parseDouble(snum); //double변환 - > 박싱
		
		//6. 기본 double -> 기본 int
		num = (int)dnum;
		
		//7. 객체 Doble -> int
		num = dobj.intValue();
		
		//8. Date -> long int
		Date today = new Date();
		long todayNum = today.getTime();
		System.out.println("todayNum : " + todayNum);
		
		//9. long -> Date
		Date hireDate = new Date(todayNum);
				
		//10. Date -> String // SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = format.format(hireDate);
		System.out.println("strDate : " + strDate);
		
		//11. String -> Date
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		String xmas = "2020/12/25 20:00";
		hireDate = format2.parse(xmas);
		System.out.println(hireDate);
		
	}

}

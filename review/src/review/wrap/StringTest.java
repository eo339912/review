package review.wrap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args) {
		//검색
		String path = "c:/app/images/pig.jpg";
		
		//1. 맨끝의 /의 위치 (lastindexof)
		int idx = path.lastIndexOf('/');
		System.out.println("/ 위치 : " + idx);
		
		//2. 파일명만 추출 lastindexof, substring
		String filename = path.substring(idx+1);
		System.out.println(filename);
		
		//3. 파일이 jpg로 끝나는지 endsWith
		boolean jpgyn = path.endsWith("jpg");
		System.out.println(jpgyn);
		
		//4. 문자열 자르기 /기준 split
		String[] paths = path.split("/");
		for(String p : paths) {
			System.out.println(p);
		}
		
		//패스워드 정규식 - 패턴체크 (대소특 8자리) regexp(regular exprestion) 정규표현식
		String pattern = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$";
		String pw = "ab123Q!"; //최소 8자리에 숫자, 문자, 특수문자 각각 1개 
		boolean result = validationPasswd(pw, pattern);
		System.out.println("패턴검사 : "+ result);
		
		
	}
	
	private static boolean validationPasswd(String pw, String pattern){
	    Pattern p = Pattern.compile(pattern);
	    Matcher m = p.matcher(pw);

	    if(m.matches()){
	        return true;
	    }
	    return false;
	}
}

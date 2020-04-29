package review.wrap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest2 {
	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		list.add(new MemberVO("100", "홍길동"));
		list.add(new MemberVO("103", "권율"));
		list.add(new MemberVO("102", "김유선"));
		
		//List -> Set
		List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
		Set<Integer> targetSet = new HashSet<>(sourceList);
		System.out.println(targetSet);
		
		//Set -> List
		Set<Integer> sourceSet = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5));
		List<Integer> targetList = new ArrayList<>(sourceSet);
		System.out.println(targetList);
		
		//List<VO> 필드로 검색, 정렬
		Collections.sort(list, new Comparator<MemberVO>() {

			@Override
			public int compare(MemberVO o1, MemberVO o2) {
				return o1.getUserid().compareTo(o2.getUserid());
			}
			
		});
		System.out.println(list);
		
		//람다식
		Collections.sort(list,(o1, o2) ->  o1.getUserid().compareTo(o2.getUserid()));
		System.out.println(list);
		
		//역순 reverse
		Collections.reverse(list);
		System.out.println(list);

		//섞기 shuffle
		Collections.shuffle(list);
		System.out.println(list);
		
	}
}

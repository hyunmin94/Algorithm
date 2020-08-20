package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumber {
	public static String solution(int[] numbers) {
		
		List<String> list = new ArrayList<String>();
		
		for(int number:numbers) {
			list.add(Integer.toString(number));
		}
		
		// 람다 표현식을 이용하여 전체 원소를 합쳤을때 최대값이 되기위해 두개의 원소를 비교하여 정렬
		Collections.sort(list, (String o1, String o2) -> {
			
			return Integer.parseInt(o2+o1) - Integer.parseInt(o1+o2);
		});
		
		// 리스트를 String 형태로 만들기 위한 작업
		String result = list.stream().collect(Collectors.joining());
        return result.charAt(0) == '0' ? "0" : result;
    }

	public static void main(String[] args) {
		// 테스트 데이터
		System.out.println(solution(new int[] {3, 30, 34, 5, 9}));
	}
}
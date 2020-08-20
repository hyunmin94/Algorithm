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
		
		// ���� ǥ������ �̿��Ͽ� ��ü ���Ҹ� �������� �ִ밪�� �Ǳ����� �ΰ��� ���Ҹ� ���Ͽ� ����
		Collections.sort(list, (String o1, String o2) -> {
			
			return Integer.parseInt(o2+o1) - Integer.parseInt(o1+o2);
		});
		
		// ����Ʈ�� String ���·� ����� ���� �۾�
		String result = list.stream().collect(Collectors.joining());
        return result.charAt(0) == '0' ? "0" : result;
    }

	public static void main(String[] args) {
		// �׽�Ʈ ������
		System.out.println(solution(new int[] {3, 30, 34, 5, 9}));
	}
}
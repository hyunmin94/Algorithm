package sort;

import java.util.Arrays;

public class HIndex {
	public static int solution(int[] citations) {
		int answer = 0;
		
		for(int i= citations.length; i>0; i--) {
			int final_i = i;
			int count = (int) Arrays.stream(citations).filter(n -> n>=final_i).count();
			if(count >= i) {
				answer = i;
				break;
			}
		}
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3, 0, 6, 1, 5}));
	}
}

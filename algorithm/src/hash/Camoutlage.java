package hash;

import java.util.HashMap;

public class Camoutlage {
	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<clothes.length;i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		for(int count : map.values()) {
			answer *= count+1;
		}
        return answer -1;
	}
	public static void main(String[] args) {
		System.out.println(solution(new String[][] {
			{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}
		}));
	}
}

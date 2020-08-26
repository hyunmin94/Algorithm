package hash;

import java.util.Arrays;
import java.util.HashMap;

public class Marathon {
	
	// 1) ������ Ȱ���� �ذ� ���
	public static String solutionFirst(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++) {
        	if(!participant[i].equals(completion[i])) return participant[i];
        }
        
        return participant[participant.length-1];
    }
	
	// 2) �ؽø��� Ȱ���� �ذ� ���
	public static String solutionSecond(String[] participant, String[] completion) {
		String answer="";
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		for(String part:participant) {
			hash.put(part, hash.getOrDefault(part, 0) + 1);
		}
		for(String comple:completion) {
			hash.put(comple, hash.get(comple) - 1);
		}
		for(String key: hash.keySet()) {
			if(hash.get(key) != 0) {
				answer = key;
				break;
			}
		}
		return answer;
    }

	public static void main(String[] args) {
		// 1) ������ Ȱ���� �ذ���
		System.out.println(solutionFirst(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, 
				new String[] {"josipa", "filipa", "marina", "nikola"}));
		
		// 2) �ؽø��� Ȱ���� �ذ���
		System.out.println(solutionSecond(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, 
				new String[] {"josipa", "filipa", "marina", "nikola"}));
	}
}

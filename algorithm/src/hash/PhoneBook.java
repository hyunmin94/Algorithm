package hash;

import java.util.Arrays;

public class PhoneBook {
	public static boolean solution(String[] phone_book) {
		
		Arrays.sort(phone_book);
		
		for(int i=0; i<phone_book.length-1; i++) {
			for(int j=i+1; j<phone_book.length; j++) {
				if(phone_book[j].startsWith(phone_book[i])) return false;
			}
		}
        return true;
    }

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"119", "97674223", "1195524421"}));
	}
}

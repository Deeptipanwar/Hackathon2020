package hackathon;
import java.util.*;
public class Hack_q18 {

	public static void main(String[] args) {
		String str="Welcome to java world";
		char arr[]=str.toCharArray();
		Map<Character,Integer> mp=new HashMap<>();
		for(char c:arr) {
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
			}else {
				mp.put(c, 1);
			}
		}
		for(char c :arr) {
			if(mp.get(c)>1) {
				System.out.print(c);
			}
		}
		
	}

}

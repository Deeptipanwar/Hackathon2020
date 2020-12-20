package hackathon;
import java.util.*;
public class Hack_05 {

	public static void main(String[] args) {
		Map<Integer,Integer> mp=new HashMap<>();
		
		int arr[]= {4,2,3,7,8,4,3};
		for(int a:arr) {
			if(mp.containsKey(a)) {
				mp.put(a, mp.get(a)+1);
			}else {
				mp.put(a, 1);
			}
			
		}for(int a:arr) {
			if(mp.get(a)==1) {
				System.out.println(a);
			}
		}
			System.out.println(mp);
		
	}

}

package hackathon;
import java.util.*;
import java.util.Scanner;

public class Hack_q15 {
	
	public static void str_uniq(String str) {
		String st[]=str.split(" ");
		Map<String,Integer> mp=new HashMap<>();
		for(String s :st) {
			if(mp.containsKey(s)) {
				mp.put(s,mp.get(s)+1);
			}else {
				mp.put(s,1);
			}
		}
		
		Set<String> s = mp.keySet(); 
	        Iterator<String> itr = s.iterator(); 
	  
	        while(itr.hasNext()) 
	        { 
	            String w = itr.next(); 
	              
	            if (mp.get(w) == 1) 
	                System.out.println(w); 
	        }     
	    } 
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter strings");
		String s1=in.nextLine();
		str_uniq(s1);
		
}
}

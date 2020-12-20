package hackathon;

import java.util.HashMap;
import java.util.Map;

public class Hack_q19 {

	public static void main(String[] args) {
		
			String str = "HelloD Deepti";
		    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		    char[] arr = str.toCharArray();

		    for (char value: arr) {

		       if (Character.isAlphabetic(value)) {
		    	   
		           if (charMap.containsKey(value)) {
		        
		               charMap.put(value, charMap.get(value) + 1);

		           } else {
		               charMap.put(value, 1);
		           }
		       }
		    }

		    System.out.println(charMap);
	}

}

package OOPs_examples;
import java.util.*;
public class set_eg {

	public static void main(String[] args) {
		int arr[]= {4,3,7,5,7,8};
		Set<Integer> st=new HashSet<>();
		for(int s:arr) {
			st.add(s);
		}
		System.out.println(st);
		TreeSet sortedSet = new TreeSet<Integer>(st);
		System.out.println(sortedSet.first());
	}
		
	}



package OOPs_examples;
import java.util.*;
public class iterators_q61 {

	public static void main(String[] args) {
		ArrayList<Integer> at=new ArrayList<>();
		at.add(10);
		at.add(20);
		at.add(30);
		at.add(40);
		
		Iterator it=at.iterator();
		while(it.hasNext()) {
			System.out.println("iterator-forward direction "+it.next());
			
		}
		ListIterator lt=at.listIterator();
		while(lt.hasNext()) {
			System.out.println("list iterator-forward direction "+lt.next());
			
		
		}
		while(lt.hasPrevious()) {
			System.out.println("list iterator-backward direction "+lt.previous());
			
		}

	}

}

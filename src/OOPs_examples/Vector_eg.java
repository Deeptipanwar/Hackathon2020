package OOPs_examples;
import java.util.*;
public class Vector_eg {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>(2);
		v.add("deep");
		v.add("panwar");
		System.out.println("Size is: "+v.size());
	    System.out.println(v.capacity());
	    v.add("hello");
		v.add("world");
		System.out.println("Size is: "+v.size());
	      System.out.println(v.capacity());
	      Enumeration en = v.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
		         System.out.print(en.nextElement() + " ");
		   }
	}



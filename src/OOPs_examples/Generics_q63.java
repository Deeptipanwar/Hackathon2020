package OOPs_examples;

public class Generics_q63 {

	
	public static <T> void Printdata(T[]arr) {
		for(T i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
			Integer [] a1= {3,6,8,5};
			Character[] c1= {'a','y','i','r','e'};
			Printdata(a1);
			Printdata(c1);
	}

}

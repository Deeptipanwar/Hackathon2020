package OOPs_examples;

public class For_each_q60 {

	public static void main(String[] args) {
	int arr[]= {4,7,9,2,6,7};
	for(int i=0;i<arr.length;i++) {
		System.out.println("after for loop " +arr[i]);
	}
	
	for(int i:arr) {
		System.out.println("after for-each loop "+i);
	}
}
}

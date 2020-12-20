package hackathon;
import java.util.Scanner;

public class selection_sort_q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("enter size of array");
		int num=input.nextInt();
		int arr[]=new int[num];
		System.out.println("enter values in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("the value entered are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++) {
			int min_val=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_val]) {
					min_val=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_val];
			arr[min_val]=temp;
		}
		System.out.println("the sorted values are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		input.close();
	}

}

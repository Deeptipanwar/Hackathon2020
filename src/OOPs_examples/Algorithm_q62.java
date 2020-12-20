package OOPs_examples;

import java.util.Scanner;

public class Algorithm_q62 {

	
	public static void rev(int arr[],int g) {
	for(int i=0;i<arr.length;i=i+g) {
		int start=i;
		int end=Math.min(i+g-1, arr.length-1);
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		}
	}
		
	
	public static void main(String[] args) {
		int ar[]= {3,2,4,7,0,3,1,5,8,4};
		int k=3;
		rev(ar,k);
		for(int v:ar) {
			System.out.print(v);
		}

	}
}


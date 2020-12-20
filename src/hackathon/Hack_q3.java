package hackathon;

import java.util.Scanner;

public class Hack_q3 {
	

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
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
				}
			}
			}
			System.out.println("the value after sorting are");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			input.close();
			}

}

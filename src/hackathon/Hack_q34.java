package hackathon;

import java.util.Scanner;

public class Hack_q34 {
	
	public static void mul(int num1,int num2) {
		int sum=num1;
		for(int i=1;i<num2;i++) {
			sum+=num1;
		}
		System.out.println(sum);
		
	}
	public static void sub(int num1,int num2) {
		int temp=num2<0?1:-1;
		int ans= num1+(num2*temp);
		System.out.println(ans);
	}
	public static void div(int num1,int num2) {
	int num3=num1+num2;
	int res=0;
	while(num3>num2) {
		num3=num3-num2;
		res++;
	}
	System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number");
		 int n1 = in.nextInt();
		 System.out.println("Enter second number");
		 int n2 = in.nextInt();
		 mul(n1,n2);
		 sub(n1,n2);
		 div(n1,n2);
	}

}

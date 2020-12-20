package hackathon;

import java.util.Scanner;

public class Hack_q28 {

	public static int recur(int num) {
		if (num>=1) {
			return num * recur(num-1);
		}else {
			return 1;
		}
		
	}
	public static void main(String[] args) {
	int fact;
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		 n = in.nextInt();
		 fact=recur(n);
		 System.out.println(fact);
	}

}

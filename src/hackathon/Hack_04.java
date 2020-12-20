package hackathon;
import java.util.Scanner;
public class Hack_04 {

	public static boolean chk_palin(int [] numb, int elem) {
		for(int i=0;i<elem/2;i++) {
			if(numb[i]!=numb[elem-i-1]) {
				return false;
			}
			
		}return true;
		
			
		}
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int n;
			System.out.println("Enter number of values in array");
			 n = in.nextInt();
			 int arr[]=new int[n];
			 System.out.println("enter all values in array");
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			
			System.out.println(chk_palin(arr,n));
		}


}

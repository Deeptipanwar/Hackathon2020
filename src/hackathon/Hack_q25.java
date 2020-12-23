package hackathon;
import java.util.Scanner;
import java.util.Scanner;

public class Hack_q25 {
	
	public static void Binary_src(int arr[],int search,int len) {
		int st=0;
		int end=len-1;
		int mid= (st+end)/2;
		while(st<=end) {
			if(arr[mid]<search) 
				st=mid+1;
			
			else if(arr[mid]==search) { 
				System.out.println(search + "item found at location " +(mid + 1));
				break;
				}
			
			else {
				end=mid-1;
			}
			mid=(st+end)/2;
		}
		if ( st > end ) {
	          System.out.println(search + " is not found.\n");}
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
        System.out.println("please enter input");
        int n=in.nextInt();
        int num[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++) {
        	num[i]=in.nextInt();
        }
        System.out.println("please enter search element");
        int sr=in.nextInt();
        Binary_src(num,sr,n);
	}

}

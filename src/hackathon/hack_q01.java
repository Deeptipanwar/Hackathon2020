package hackathon;
import java.util.Scanner;
public class hack_q01 {
	
	public static Boolean chkbool(Boolean a,Boolean b,Boolean c) {
		if ((a&&b)|| (b&&c)||(c&&a)){
			return true;
		}else{
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter boolean 1");
	    boolean b1 = in.nextBoolean();
		System.out.println("enter boolean 2");
		 boolean b2 = in.nextBoolean();
		System.out.println("enter boolean 1");
	    boolean b3 = in.nextBoolean();
		
		System.out.println(chkbool(b1,b2,b3));

	}

}

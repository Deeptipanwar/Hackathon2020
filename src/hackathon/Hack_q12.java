package hackathon;

public class Hack_q12 {

	public static boolean palindrome(String st) {
		 String str="";
		for(int i=st.length()-1;i>=0;i--) {
			str=str+st.charAt(i);
			
		}
		System.out.println(str);
		if(str.equals(st)) {
			return true;
		}
		return false;
	 }
	
	public static void main(String[] args) {
		System.out.println(palindrome("malayalam"));
		

	}

}

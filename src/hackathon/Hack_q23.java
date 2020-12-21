package hackathon;

import java.util.Scanner;

public class Hack_q23 {
	
 public static boolean is_type(String str) {
	 for(int i=0;i<str.length();i++) 
		 if(Character.isDigit(str.charAt(i))==false)
			 return false;
		 
		 return true;
	 
 }
 public static boolean is_bool(String str) {
	 if(str.equals("true")|| str.equals("false")) 
		 return true;
	 
	 return false;
	 
 }
 
    static public void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("please enter input");
        String s=in.next();
        if(is_bool(s)) {
        	 System.out.println("it is a boolean");
        }
        else if(is_type(s)) {
        	System.out.println("it is an integer");
        }else {
        	System.out.println("it is an string");
        }
    }
}


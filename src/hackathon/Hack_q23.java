package hackathon;

import java.util.Scanner;

public class Hack_q23 {
	static void isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == true)
            	 System.out.println("Integer");
 
            else if(s.equals("true")|| s.equals("false"))
            	System.out.println("boolean");
        
            else {
            	System.out.println("String");
            }
    }
 
 
    static public void main(String[] args)
    {
        
    	Scanner in=new Scanner(System.in);
		System.out.println("enter input");
		String str=in.next();
		isNumber(str);
    }
}


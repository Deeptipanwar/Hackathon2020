package hackathon;

public class Hack_q17 {

	public static void main(String[] args) {
		String str="WelCome To JaVa WorLd 2020";
		int upper=0;int lower=0;int number=0;
		char ans[]=str.toCharArray();
		for(int i=0;i<ans.length;i++) {
			if(ans[i]>='A' && ans[i]<='Z')
				upper++;
			else if(ans[i]>='a' && ans[i]<='z')
				lower++;
			else if(ans[i]>='0' && ans[i]<='9')
				number++;
		}
		System.out.println("upper char are " + upper);
		System.out.println("lower char are " +lower);
		System.out.println("numbers are " +number);

	}

}

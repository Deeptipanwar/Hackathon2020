package OOPs_examples;

public class Exceptions {

	public static void main(String[] args) {
		try{
			int arr[]=new int[5];
			int s=arr[7];
			System.out.println("inside try block");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catched the exception");
		}
		finally{
			System.out.println("finally");
		}


	}

}

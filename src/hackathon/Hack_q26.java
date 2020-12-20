package hackathon;
import java.util.Scanner;
public class Hack_q26 {

	public static void Merge_sorted(int arr1[],int arr2[]){
        int len1=arr1.length,len2=arr2.length,pointer1=0,pointer2=0;
        int gap=len1+len2;
        gap=(gap/2)+(gap%2);
        while(gap>1){
            pointer1=0;
            pointer2=gap-1;
            
            while(pointer2<len1){
                check(arr1,arr1,pointer1,pointer2);
                pointer1++;
                pointer2++;
            }
            
            pointer2=0;
            while(pointer1<len1 && pointer2<len2){
                check(arr1,arr2,pointer1,pointer2);
                pointer1++;
                pointer2++;
            }
           
            pointer1=0;
            while(pointer2<len2){
                check(arr2,arr2,pointer1,pointer2);
                pointer1++;
                pointer2++;
            }
            gap=(gap/2)+(gap%2);
        }
    }
 public static void check(int arr1[],int arr2[],int pointer1,int pointer2){
     if(arr1[pointer1]>arr2[pointer2]){
         int temp=arr1[pointer1];
         arr1[pointer1]=arr2[pointer2];
         arr2[pointer2]=temp;
     }
 }
	public static void main(String[] args) {
		int arr1[]={2,4,6,8,9},arr2[]={1,3,5,6,10};
		Merge_sorted(arr1,arr2);
        for(int i : arr1)
            System.out.print(i+" ");
        for(int i : arr2)
            System.out.print(i+" ");
        System.out.println();
    }
}



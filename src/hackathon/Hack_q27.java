package hackathon;
import java.util.Arrays;
public class Hack_q27 {
	
	
	public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
    
    
    private void sort(int[] array, int l, int r) {
        if (l < r) { 
            int pivot = array[l];
            
            int i = l;
            int j = r;
            while (i < j) {
            	i += 1;
              
                while (i <= r && array[i] < pivot) {
                    i += 1;
                }
             
                while (j >= l && array[j] > pivot) {
                    j -= 1;
                }
                if (i <= r && i < j) {
                     
                    swap(array, i, j);
                }
            }
          
            swap(array, l, j);
         
            sort(array, l, j - 1);
            sort(array, j + 1, r);
        }
    }
    
    
    private void swap(int[] array, int i, int j) {
        if (i >= 0 && j >= 0 && i < array.length && j < array.length) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    
    public static void main(String[] args) {
        int[] array = new int[] {
            7, 6, 10, 5, 9, 2, 1, 15, 7
        };
        
        new Hack_q27().sort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
    }

}
	

 



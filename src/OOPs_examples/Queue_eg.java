package OOPs_examples;
import java.util.*; 

public class Queue_eg { 
  
    public static void main(String args[]) 
    { 
        Queue<Integer> pq = new PriorityQueue<>(); 
  
        pq.add(10); 
        pq.add(20); 
        pq.add(30); 
        
        System.out.println(pq.peek());
        System.out.println(pq.poll());
  
        Iterator iterator = pq.iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " "); 
        } 
    } 
} 

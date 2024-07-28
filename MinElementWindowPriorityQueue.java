import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinElementWindowPriorityQueue {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(10);
        list.add(3);
        list.add(7);

        ArrayList<Integer> result = new ArrayList<>();
        int k=3;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            queue.add(list.get(i));
        }

        /* THis will fetch the smallest/min element from the window size K*/
        result.add(queue.peek());

        queue.remove(list.get(0));
        int i=0;
        for(i=k; i<list.size(); i++){
            System.out.println("Queue = "+queue);
            queue.add(list.get(i));
            result.add(queue.peek());
            queue.remove(i-k+1);
        }
        System.out.println("Result : "+result);
    }
    
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array, all elements appear even no. times except 1 element that appears odd no. times.
Final the element that appears odd no. times. Find the element that appears odd no,. of times.
 */
public class LogicalSingleNumber {

    public static void main(String[] args) {
        int array[] = {2,8,3,1,2,2,3,2,8,1,1};

        /*Solution 1 : HashMap */
        Map<Integer,Integer>  map = new HashMap<>();
       for(int i:array){
           if(map.containsKey(i)){
               map.put(i,map.get(i)+1);
           }else{
               map.put(i,1);
           }
       }

      System.out.println("The number is : "+ map.keySet().stream().filter(x-> x%2==1).findAny().stream().findFirst().get());

       /*
       Solution 2
        */
        int n=0;
        for(int i: array){
            n = n^i;
        }
        System.out.println("The number is : "+n);
    }
}

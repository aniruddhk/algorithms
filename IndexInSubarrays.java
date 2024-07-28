public class IndexInSubarrays {
    public static void main(String args[]) {
      int a[]={3,1,2,4};
      
      /* In how many subarrays index i is present*/
      for(int i=0; i<a.length; i++){
          int indexes = (i+1)*(a.length-i);
          System.out.println(i+". ---> "+indexes);
      }
      
    }
}

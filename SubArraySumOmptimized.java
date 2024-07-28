public class SubArraySumOmptimized {
    public static void main(String args[]) {
      int a[]={3,1,2,4};
      int totalSum=0;
      for(int i=0; i<a.length; i++){
        int product=(i+1)*(a.length-i);
        totalSum+=(product*a[i]);
      }
      System.out.println("Total Sum = "+totalSum);
    }
}

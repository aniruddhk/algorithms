public class SubArraySumBruteForce {
    public static void main(String args[]) {
      int a[]={3,1,2,4};
      int totalSum=0;
      for(int i=0; i<a.length; i++){
          int sum=0;
          for(int j=i; j<a.length; j++){
              sum+=a[j];
              totalSum+=sum;
              System.out.println("Sum="+sum+" *** Total Sum="+totalSum);
          }
      }
      System.out.println("Total Sum = "+totalSum);
    }
}

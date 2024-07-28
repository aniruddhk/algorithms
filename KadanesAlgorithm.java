public class KadanesAlgorithm {
    public static void main(String args[]) {
        int array[] = {-25,-10,-2,-16,-1};
        
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<array.length; i++){
            currentSum+=array[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        
        System.out.println("Max Sum = "+maxSum);
    }
}

public class MaxSubarraySum {
    public static void main(String args[]) {
        int a[]={-3,4,-2,5,3,-2,8,2,-1,4};
        int k=5;
        int sum = 0;
        
        for(int i=0; i<k; i++){
            sum+=a[i];    
        }
        int minIndex=0;
        int maxIndex=0;
        int max=sum;
        for(int i=k; i<a.length; i++){
            sum = sum - a[i-k];
            sum = sum + a[i];
            System.out.println("Sum = "+sum+" Max = "+max);
            if(sum>max){
                minIndex= i-k+1;
                maxIndex= i;
                max=sum;
            }
        }
        System.out.println("max sum is : "+max+". ---> minIndex="+minIndex+". MaxIndex="+maxIndex);
        
    }
}

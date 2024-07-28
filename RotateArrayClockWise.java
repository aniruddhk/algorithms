public class RotateArrayClockWise {
    public static void main(String[] args) {
        int a[]={3,-2,1,4,6,9,8};
        int k=1;
        if(a.length%k==0)
            System.out.println(a);
        else{
            reverse(a,0);
        }
    }
    private static void reverse(int a[],int s){
        int start  = s;
        int end = a.length-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

    }
}



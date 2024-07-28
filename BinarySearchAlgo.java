public class BinarySearchAlgo {
   
    private static int binarySearch(int a[],int low, int high, int x){
        
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        
        if(a[mid]==x){
            return mid;
        }
        if(x<a[mid]){
            return binarySearch(a,low,mid-1,x);
        }else{
            return binarySearch(a,mid+1,high,x);
        }
        
    }
    public static void main(String args[]) {
        
        int a [] = {1,2,3,4,5,6,7,8,9,10};
        int index = binarySearch(a,0,a.length-1,11);
        System.out.println(index);
        
        
    }

}

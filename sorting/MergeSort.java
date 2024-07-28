package sorting;

public class MergeSort {
   
    private static void mergeSort(int a[],int start, int end){
        
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }
    
    private static void merge(int a[],int start, int mid, int end){
        int temp[]=new int[end-start+1];
        
        int i=start, k=0, j=mid+1;
        
        while(i<=mid && j<=end){
            if(a[i]<=a[j]){
                temp[k]=a[i];
                k++;
                i++;
            }else{
                temp[k]=a[j];
                j++;
                k++;
            }
        }
        
        while(i<=mid){
            temp[k]=a[i];
            
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=a[j];
            j++;
            k++;
        }
        
        
        for(i=start; i<=end; i++){
            a[i]=temp[i-start];
        }
    
    }
    
    
    public static void main(String args[]) {
        
        //0,1,1,2,3,5
     
        int a[] = {9,8,7,6,5,4,3,2,0,-1};
        System.out.println("Before Sorting...");
        for(int i:a){
            System.out.print(i+" ");
        }
        
        mergeSort(a,0,a.length-1);
        
         System.out.println("After Sorting...");
        for(int i:a){
            System.out.print(i+" ");
        }
        
        
        
    }

}

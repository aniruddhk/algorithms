public class ReverseArray {
    public static void main(String args[]) {
      int a[] = {3,-2,6,8,2,99};
      int k=10;
      boolean stats=false;
      int endIndex=a.length-1;
      int start=0;
      while(start<endIndex){
          
          int temp=a[endIndex];
          a[endIndex]=a[start];
          a[start]=temp;
          endIndex--;
          start++;
      }
      
      for(int i=0; i<a.length; i++){
        System.out.println(a[i]);    
      }
      
    }
}

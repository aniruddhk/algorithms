/* Given an array elements, count the number of elkements having atlkeast 1 element greater than itself */
public class AtleastOneMax {
    public static void main(String args[]) {
      int a[] = {3,-2,6,8,4,8,5};
      int max_count=0, max=a[0];
      for(int i=0; i<a.length; i++){
          if(a[i]>max){
              max=a[i];
              max_count=0;
          }
          if(max==a[i]){
              max_count++;
          }
      }
      System.out.println(a.length-max_count);
    }
}

public class PairClass {
    public static void main(String args[]) {
      int a[] = {3,-2,6,8,2};
      int k=10;
      boolean stats=false;
      for(int i=0; i<a.length; i++){
          for(int j=i+1; j<a.length; j++){
              if(a[i]+a[j]==k){
                  stats=true;
                  break;
              }
          }
      }
      System.out.println(stats);
    }
}

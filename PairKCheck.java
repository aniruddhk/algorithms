import java.util.HashSet;
import java.util.Set;

public class PairKCheck {
    public static void main(String[] args) {
        int a[]={3,-2,1,4,3,6,8};
        int k=10;
        solveByBruteForce(a,10);
        solveByAdditionalSpace(a,10);
    }

    private static void solveByBruteForce(int[] a,int k){
        boolean found=false;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]+a[j]  == k){
                    System.out.println("Pair exists ("+a[i]+" , "+a[j]+")");
                    found=true;
                    break;
                }
            }
            if(found)
                break;
        }
    }

    private static void solveByAdditionalSpace(int a[],int k){
        Set<Integer>  set = new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        for(int i:a){
            int x = k-i;
            if(set.contains(x)){
                System.out.println("Pair exists ("+i+" , "+x+")");
                break;
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;

/*
 Given an integer number N find if ith bit is set or not
 */
public class CheckSetBit {
    public static void main(String[] args) {
        int N=21;
        int i=2;

        List<Boolean> list = new ArrayList<>();
        //int rem=0;
        int quo=0;
        int x=N;
        String rem="";
        while(x>0){
            rem+=x%2;
            x=x/2;
        }

        boolean cal = list.get(i) ? true:false;

        System.out.println("Binary is : "+rem);
        System.out.println(i+"th bit is "+list.get(i));

        boolean val = ((N>>>i) & 1) ==1 ?  true:false;
        System.out.println(i+"th bit is "+val );

        int n=21;

        /**
         * Check if ith bit is set or not.
         */
        i=2;
        System.out.println(i+"th bit is set in "+n+" = "+checkBit(n,i));
        n=25;
        i=1;
        System.out.println(i+"th bit is set in "+n+" = "+checkBit(n,i));

        /**
         *  Given N & i, sey te i th bit of N
         */

        n=45;
        i=3;
        /*
        Ns value doesn't change as bit is already set  1 0 1 1 0 1
         */
        setBit(n,i);

        /*
        Ns values changes as bit is already -   1 0 1 1 0 1
         */
        i=1;
        setBit(n,1);

        n=24;

        clearBit(n,i);
        clearBit(n,3);

        /**
         * Toggle ith bit
         *
         */
        n=47;
        i=2;
        toggleBit(n,i);
        toggleMethod2(n,i);


    }
    public static boolean  checkBit(int N,int i){

        return ((1<<i)&N) == 0 ?  false:true;

    }

    public static int  setBit(int N,int i){
        System.out.println("n = "+N);
        int x = N=(1<<i)|N;
        System.out.println("n = "+N);
        return x;
    }

    public static int clearBit(int N, int i){
        System.out.println("n = "+N);
        int x = N=(~(1<<i))&N;
        System.out.println("n = "+N);
        return x;
    }
    public static void toggleBit(int N, int i){
        System.out.println("Toggle ith bit : ");
        System.out.println("Toggle : n = "+N);
        int n=0;
        if(checkBit(N,i)){
            n=clearBit(N,i);
        }else{
            n=setBit(N,i);
        }
        System.out.println("Toggle: n = "+n);
    }

    public static void toggleMethod2(int N,int i){
        System.out.println("toggleMethod2 : n = "+N);
        N = N^(1<<i);
        System.out.println("toggleMethod2 : n = "+N);
    }
}

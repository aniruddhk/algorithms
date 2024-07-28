public class CountSetBits {
    public static void main(String[] args) {
        /*
            Given +ve integer, toggle all the bits starting from the rightmost set bit
         */
        int N=24;
        toggleBit(N);
        toggleBitAnotherSolution(N);


        /**
         * Count number of set bits in N
         */
        N=44;
        countSetBitsInNSolution1(N);
        countSetBitsInNSolution2(N);
    }

    private static void countSetBitsInNSolution1(int n) {
        int count=0;
         while(n>0){
             if((n&1)!=0){
                 count++;
             }
             n=n>>1;
         }
        System.out.println("Number of set bits in  "+n+" is = "+count);

    }

    private static void countSetBitsInNSolution2(int n) {

        int ans = n&(n-1);
        System.out.println("Number of set bits in  "+n+" is = "+ans);

    }

    private static int toggleBitAnotherSolution(int n) {
        return n-1;
    }

    private static int toggleBit(int N){
        int i=0;
        System.out.println("N = "+N);
        boolean condition = true;
        while (condition){
            if(CheckSetBit.checkBit(N,i)){
                System.out.println("Condition  :  "+i);
                condition = false;
            }
            N = N^(1<<i);
            i++;
        }
        System.out.println("N = "+N);
        return N;
    }


}


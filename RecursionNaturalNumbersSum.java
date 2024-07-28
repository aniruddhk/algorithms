public class RecursionNaturalNumbersSum {
   
    private static int sumOfNaturalNumbers(int n){
        if(n==0){
            return 0;
        }
        return n+(sumOfNaturalNumbers(n-1));
   
    }
    public static void main(String args[]) {
        
        String str="";
        System.out.println(sumOfNaturalNumbers(10));
        
    }

}

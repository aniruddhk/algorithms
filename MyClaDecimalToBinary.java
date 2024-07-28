public class MyClaDecimalToBinary {
   
    private static String convert(int n,String str){
        if(n>0){
            return n%2+str+convert(n/2,str);
        }
        return str;
    }
    public static void main(String args[]) {
        
        String str="";
        System.out.println(convert(9,str));
        
    }
        
        
        
        
    
}

public class MinLengthMinMax {
    public static void main(String args[]) {
         System.out.println("\nResult"+getLength());
    }
     private static int getLength(){
        int a[]={2,1,6,6,2,1,5,2,6,4,1};
        int min=2, max=6;
        int minIndex=-1,maxIndex=-1;
        int minLength=Integer.MAX_VALUE;
        int result=-1;
        for(int i=0; i<a.length; i++){
            if(a[i]==min){
                minIndex=i;
                if(maxIndex!=-1){
                    
                     result= minIndex>maxIndex? minIndex-maxIndex+1 : maxIndex-minIndex+1;
                     System.out.println("IF"+maxIndex+"-"+minIndex+" Result : "+result);
                     if(result<minLength){
                         minLength=result;
                     }
                    
                }
            }
            if(a[i]==max){
                maxIndex=i;
                if(minIndex!=-1){
                    
                    result= minIndex>maxIndex? minIndex-maxIndex+1 : maxIndex-minIndex+1;
                    System.out.println("ELSE:"+maxIndex+"-"+minIndex+" Result : "+result);
                    if(result<minLength){
                         minLength=result;
                     }
                   
                }
            }
        }
        System.out.println("Result : "+minLength);
        return minLength;
    }
}

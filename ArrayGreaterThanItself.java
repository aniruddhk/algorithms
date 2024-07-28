public class ArrayGreaterThanItself {
    public static void main(String[] args) {
        int a[] = {3,-2,6,8,4,8,5};
        int max = Integer.MIN_VALUE;
        for(int i:a){
            if(i>max){
                max=i;
            }
        }
        int count=0;
        for(int i:a){
            if(max>i){
                count++;
            }
        }
        System.out.println("Elements : "+count);
    }
}

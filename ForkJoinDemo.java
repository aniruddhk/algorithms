import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    static class BinarySearch extends RecursiveTask<Integer>{

        private final int[] array;
        private final int high;
        private final int low;
        private final int target;

        BinarySearch(int[] array, int high,int low,int target){
            this.array = array;
            this.high = high;
            this.low = low;
            this.target = target;
        }
        @Override
        protected Integer compute() {
            if(low>high){
                return -1;
            }
            int mid = low+(high-low)/2;
            if(array[mid]==target){
                return mid;
            }else if(target>array[mid]){
                BinarySearch right = new BinarySearch(array, high, mid+1, target);
                right.fork();
                return right.join();
            }else{
                BinarySearch left = new BinarySearch(array, mid-1, low, target);
                left.fork();
                return left.join();

            }
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int array[]={1,2,3,4,5,6,7,8,9};
        int target = 2;
        int index = forkJoinPool.invoke(new BinarySearch(array,array.length, 0,target));
        System.out.println("Found ?"+index);
    }
}

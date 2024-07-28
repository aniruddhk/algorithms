public class MatrixColumnSum {
    public static void main(String args[]) {
        int a[][]=new int[4][4];
        int count=1;
        int r=a.length;
        int c=a[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j]=count;
                count++;
            }
        }
        
        for(int i=0; i<c; i++){
            int sum=0;
            for(int j=0; j<r; j++){
                sum+=a[j][i];
                System.out.print(a[j][i]+" ");
            }
            System.out.print(" = "+sum+" \n");
        }
      
    }
}

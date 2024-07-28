public class SquareMatrixTransponse {
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
        
        System.out.println("Original Matrix : ");
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<=i; j++){
                int temp = a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=temp;
    
            }
            System.out.println();
        }
        
        System.out.println("Transpose Matrix : ");
         for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
    }
}

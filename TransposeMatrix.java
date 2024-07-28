public class TransposeMatrix {
    public static void main(String args[]) {
        int a[][]=new int[3][4];
        int count=1;
        int r=a.length;
        int c=a[0].length;
        
        System.out.println("Row length : "+r);
        System.out.println("Column length : "+c);
        
        
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
        
        int transpose[][] = new int[c][r];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                transpose[j][i]=a[i][j];
            }
        }
       
       System.out.println("Transpose Matrix : ");
         for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
               System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
    }
}

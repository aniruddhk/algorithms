public class MatrixDiagonal {
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
        System.out.println("Diagonal from left to right...");
        for(int i=0; i<c; i++){
           
            System.out.print(" = "+a[i][i]+" \n");
        }
      
        System.out.println("Diagonal from Right to Left..."); 
        int i=0,j=c-1;
        while(j>=0 && i<r){
            
            System.out.print(" = "+a[i][j]+" \n");
            j--;
            i++;
        }
    }
}

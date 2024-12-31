import java.util.Scanner;
public class AltMatrixSum {
    static Scanner sc=new Scanner(System.in);
     static void inputMatrix(int[][]  mat,int n){
           for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   mat[i][j]=sc.nextInt();
               }
         }
     }
     static void displayMatrix(int[][] matrix){
         int n=matrix.length;
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 System.out.print(matrix[i][j]+" ");
             }
             System.out.println();
         }
     }
   static  void altMatrixSum(int[][] matrix,int n){
         //A square is black if (row + column) is even.
        //A square is white if (row + column) is odd.
         int sum1=0;
         int sum2=0;
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if((i+j)%2==0){
                     sum1+=matrix[i][j];
                 }else{
                     sum2+=matrix[i][j];
                 }
             }
         }
       System.out.println(sum1+" "+sum2);
   }


    public static void main(String[] args) {
        int n=sc.nextInt();
        int[][]  mat=new int[n][n];
        inputMatrix(mat,n);
        displayMatrix(mat);
        altMatrixSum(mat,n);

    }
}

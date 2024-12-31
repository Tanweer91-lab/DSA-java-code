import java.util.Scanner;
public class DiagonallyTraversal {
    static Scanner sc=new Scanner(System.in);
    static void inputMatrix(int[][] matrix,int m,int n){
           for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                   matrix[i][j]=sc.nextInt();
               }
           }
    }
    static void displayMatrix(int[][] matrix,int m,int n){
           for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                   System.out.print(matrix[i][j]+" ");
               }
               System.out.println();
           }
    }
    static void printDiagonally(int[][] matrix,int n){
        // printing upper triangle
        for(int row=0;row<n;row++){
             int j=n-1;
             while(j<n){
                 System.out.print(matrix[row][j]+" ");
                 j++;
             }
        }
    }


    public static void main(String[] args) {
       int n=sc.nextInt();
       int[][] matrix=new int[n][n];
       inputMatrix(matrix,n,n);
       printDiagonally(matrix,n);

    }
}

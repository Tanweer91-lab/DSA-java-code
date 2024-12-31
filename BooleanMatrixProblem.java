import java.util.*;
public class BooleanMatrixProblem {
    static void printMatrix(int[][] arr,int m,int n) {
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
static void fillwithOne(int[][] matrix,int m,int n){
          for(int i=0;i<m;i++){
              int count=0;
              for(int j=0;j<n;j++){
                  if(matrix[i][j]==1){
                      count++;
                  }
              }
              if(count>0){
                  Arrays.fill(matrix[i],1);
              }
          }
          printMatrix(matrix,m,n);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] mat={{1 ,0 ,0 ,0},{0 ,0 ,0 ,0},{0 ,1 ,0 ,0},{0 ,0 ,0 ,0},{0 ,0 ,0 ,1}};
        //Arrays.fill(mat[0],1);
        //printMatrix(mat,m,n);
        fillwithOne(mat,m,n);

    }
}

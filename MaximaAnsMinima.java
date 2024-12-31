import java.util.Scanner;
public class MaximaAnsMinima {
    static Scanner sc=new Scanner(System.in);
    static void inputMatrix(int[][] matrix,int n){
           for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                   matrix[i][j]=sc.nextInt();
               }
           }
    }
    static int[] minimumInArray(int[] arr){
           int min=Integer.MAX_VALUE,index=-1;
           int n=arr.length;
           for(int i=0;i<n;i++){
                if(i<min){
                    min=arr[i];
                    index=i;
                }
           }
           int[] ans={min,index};
           return ans;
    }
    static int maxandMinima(int[][] mat,int n){
          for(int i=0;i<n;i++) {
              int min=mat[i][0];
              int index=0;
              for(int j=1;j<n;j++){
                  if(min>mat[i][j]){
                      min=mat[i][j];
                      index=j;
                  }
              }
              boolean isMax=true;
              for(int k=0;k<n;k++){
                  if(min<mat[k][index]){
                      isMax=false;
                      break;
                  }

              }
              if(isMax){
                  return min;
              }
          }
          return -1;
    }


    public static void main(String[] args) {
      int n=sc.nextInt();
      int[][] mat=new int[n][n];
      inputMatrix(mat,n);
        System.out.println(maxandMinima(mat,n));
        int[] temp=minimumInArray(mat[0]);
        System.out.println(temp[0]+" "+temp[1]);

    }
}

import java.util.*;
public class ReverseRowMatrix {
    public static void main(String[] args) {
        int n=3;
        int[][] ans={{7  ,2  ,3},
                {2  ,3  ,4},
                {5  ,6  ,1} };
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=ans[i][j];
                ans[i][j]=ans[j][i];
                ans[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int start=0,end=n-1;
            while(start<end){
                int temp=ans[i][end];
                ans[i][end]=ans[i][start];
                ans[i][start]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(ans.length);

    }
}

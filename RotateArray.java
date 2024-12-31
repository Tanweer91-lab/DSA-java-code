import java.util.Scanner;
public class RotateArray {
    static Scanner sc=new Scanner(System.in);
    static void inputArray(int[] arr){
          int n=arr.length;
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
    }
    static void displayArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static int[] rotateArray(int[] arr,int k){
         int n=arr.length;
         if(k%n==0){
           return arr;
         }
         int[] ans=new int[n];
         int j=0;
         k=k%n;
         if(k<0){
             k=n+k;
         }
         for(int i=n-k;i<n;i++){
             ans[j++]=arr[i];
         }
         for(int i=0;i<n-k;i++){
             ans[j++]=arr[i];
         }
         return ans;

    }


    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] arr=new int[n];
        inputArray(arr);
        displayArray(arr);
        int k=sc.nextInt();
       int[] ans= rotateArray(arr,k);
       displayArray(ans);


    }
}

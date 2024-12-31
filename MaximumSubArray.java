import java.util.Scanner;
public class MaximumSubArray {
    static  Scanner sc=new Scanner(System.in);
    static void inputArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void displayArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int maximumSumSubArray(int[] arr){
          int max=arr[0];
          for(int i=0;i<arr.length;i++){
              int sum=0;
              for(int j=i;j<arr.length;j++){
                   sum+=arr[j];
                   if(sum>max){
                       max=sum;
                   }
              }
          }
          return max;
    }
    public static void main(String[] args) {
       int n=sc.nextInt();
       int[] arr=new int[n];
       inputArray(arr);
       displayArray(arr);
        System.out.println(maximumSumSubArray(arr));

    }
}

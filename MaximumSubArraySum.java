//Maximum Sum Subarray
//Given an array arr of size N. The task is to find the sum of the
// contiguous subarray within a arr with the largest sum.
import java.util.Scanner;
public class MaximumSubArraySum {
    static int  maximumSumSubArray(int[] arr){
        int sum=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int newSum=0;
            for(int j=i;j<n;j++){
                newSum+=arr[j];
                if(sum<newSum){
                    sum=newSum;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        MyArray.printArray(arr);
        System.out.println(maximumSumSubArray(arr));

    }
}

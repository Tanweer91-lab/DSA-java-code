/*Subarray sum divisible by k
Given an integer array nums and an integer k, print the number of
 non-empty subarrays that have a sum divisible by k.
A subarray is a contiguous part of an array.
 */
import java.util.Scanner;
public class SubArraySumDivisiblebyK {
    static int countSubArray(int[] arr,int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum%k==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        int ans=countSubArray(arr,n,k);
        System.out.println(ans);
    }
}

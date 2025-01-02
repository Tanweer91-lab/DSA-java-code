//Divisible Sum Pairs
//Given an array of integers, arr, and a positive integer k,
// determine the number of (i,j) pairs in the array where i<j and arr[i] + arr[j] is divisible by k.
import java.util.Scanner;
public class DivisiblePairByK {
    static int countPair(int[] arr,int k){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])%k==0){
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
        System.out.println(countPair(arr,k));
    }
}

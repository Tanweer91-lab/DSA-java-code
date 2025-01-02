// You are given an array arr of length n. You have to come up with an in-place solution.
import java.util.Scanner;
public class Reverse {
    static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        MyArray.printArray(arr);
        reverseArray(arr);
        MyArray.printArray(arr);
    }
}

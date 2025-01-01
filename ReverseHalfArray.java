/*Reverse second half
You are given an integer array arr of size N. You need to reverse the second half of the array and print the resulting array.
Input Format:
The first line of input contains N representing the number of elements.
The second line of input contains N space separated integers, representing elements of the array arr.
Output Format:
Print the array arr, after reversing its second half.
Example 1
Input
5
2 1 3 1 1
Output
2 1 1 1 3
Explanation
Second half of the array starts from (n/2)th element which is 2, we revrse array from arr[2] to arr[4] and get array as [2, 1, 1, 1, 3].
Example 2
Input
4
1 2 3 4
Output
1 2 4 3
Explanation
Second half of the array starts from (n/2)th element which is 2, we revrse array from arr[2] to arr[3] and get array as [1, 2, 4, 3].
Constraints
1 <= N <= 10^5
1 <= arr[i] <= 10^6*/

import java.util.Scanner;
public class ReverseHalfArray {
    static void halfReverse(int[] arr,int n){
        int start=n/2;
        int end=n-1;
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
        halfReverse(arr,n);
        MyArray.printArray(arr);
    }
}

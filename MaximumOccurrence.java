
/* Maximum occurrence
You are given an array arr of length n. Your task is to print the element which has maximum occurrences in the array.
If two elements have the same occurrence then print the smaller element

Input Format
The first line of input contains an integer n, size of the array.
The next line contains n space seperated integers denoting the elements of the array.

Output Format
Print single integer denoting the maximum occurring element in the array.

Example 1
Input
8
7 7 6 4 8 7 3 1
Output
7
Explanation
We have arr = [7 7 6 4 8 7 3 1]
As 7 is occurring 3
Example 2
Input
7
9 8 1 1 2 2 3
Output
1
Explanation
1 and 2 have same occurrence that is 2 so print smaller element i.e. 1.
Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^9*/import java.util.*;
public class MaximumOccurrence {
    static int maximumOccurrence(int[] arr){
        int n=arr.length;
        int count=0;
        int newCount=1;
        int ans=arr[0];
        //first we sort the array.
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(newCount>count){
                    count=newCount;
                    ans=arr[i-1];
                }
                newCount=1;
            }else{
                newCount++;
            }
        }
        if(newCount>count){
            ans=arr[n-1];
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        MyArray.printArray(arr);
        System.out.println(maximumOccurrence(arr));
    }
}

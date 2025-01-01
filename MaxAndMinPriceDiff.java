/*Min and Max difference between price
There are n shops and each shops has a price for a particular item.
We have the price array of size n. Find the min difference between price of any 2 shops and the max price difference between the price of 2 shops.
Note: There will be no duplicate elements in array.
Your task is to complete the function minMaxPrice which receives the input array as parameter and prints the min difference between price of any 2 shops and the max price difference between the price of 2 shops separated by space.
Input Format
Input consists of two lines.
First line contains an integer n.
Next line contains n spaced integers.
Output Format
Print the minimum and maximum price differences respectively separated by space in a single line.
Example 1
Input
6
7 1 5 3 6 4
Output
1 6
Explanation
Here minimum price difference is 1 between (4,5) or (5,6) or (6,7) and maximum price difference is 6 between (1,7).
Example 2
Input
5
1 2 3 4 5
Output
1 4
Explanation
Here minimum price difference is 1 between (1,2) or (2,3) or (3,4) or (4,5) and maximum price difference is 4 between (1,5).
Constraints
2 <= n <= 10^5
1 <= prices[i] <= 10^3*/
import java.util.*;
public class MaxAndMinPriceDiff {
    public static void minAndMaxDiff(int[] arr){
           int n=arr.length;
           Arrays.sort(arr);
           int mindiff=Integer.MAX_VALUE;
           for(int i=1;i<n;i++){
               if(arr[i]-arr[i-1]<mindiff){
                   mindiff=arr[i]-arr[i-1];
               }
           }
           int maxDiff=arr[n-1]-arr[0];
        System.out.println(mindiff+" "+maxDiff);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        MyArray.printArray(arr);
        minAndMaxDiff(arr);
    }
}

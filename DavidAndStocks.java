/*David and Stocks 1
Your friend David recently started investing in stocks. He monitored his daily gains(positive integer) and losses(negative integer) for n days.
Since David has just started with investing, he is not focusing in having profits, he aims at not having losses. So, he wants to find the longest continuous streak of days when he neither had profited nor loss, ie, maximum number of continuous days when sum of profit/loss of each day is 0.
Help David in this task.
Input Format
In example input, the first line contains an integer n which is the number of days.
The next line contains n space-separated integer denoting the profit or loss of n days.
Output Format
For each test case, return an integer denoting the maximum number consecutive of days when David had no profit and loss.
Example 1
Input
6
0 5 -5 0 3 2
Output
4
Explanation
[-5, 0, 3, 2] is the longest subarray with zero-sum. Thus answer is 4.
Example 2
Input
2
0 1
Output
1
Explanation
[0] is the only possible subarray with zero-sum. Thus answer is 1.
Constraints
1 <= n <= 10^3
-10^6 <= a[i] <= 10^6*/
import java.sql.SQLOutput;
import java.util.Scanner;
public class DavidAndStocks {
    public static int continuousSequence(int[] arr){
         int n=arr.length;
         int count=0;
         for(int i=0;i<n;i++){
             int newCount=0,sum=0;
             for(int j=i;j<n-i;j++){
                 sum+=arr[j];
                 newCount++;
                 if(sum==0){
                     if(count<newCount){
                         count=newCount;
                     }
                 }
             }
         }
         return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        MyArray.printArray(arr);
        System.out.println(continuousSequence(arr));
    }
}

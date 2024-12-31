import java.util.Scanner;
public class SumSubArrayDivisibleByK {
    static Scanner sc=new Scanner(System.in);
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
    static int sumSubArrayByK(int[] arr,int k){
        int count=0;
        int length=arr.length;
        for(int i=0;i<length;i++){
            int sum=0;
            for(int j=i;j<length;j++){
                sum=sum+arr[j];
                if(sum%k==0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        inputArray(arr);
        displayArray(arr);
        System.out.println(sumSubArrayByK(arr,k));

    }
}

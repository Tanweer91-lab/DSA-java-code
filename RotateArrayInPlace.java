import java.util.Scanner;

public class RotateArrayInPlace {
    static Scanner sc=new Scanner(System.in);
    static void inputArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void displayArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void reverseArray(int[] arr,int i,int j){
         while(i<j){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
         }
    }
    static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        if(k<0){
            k=n+k;
        }
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,0,n-1);

    }

    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] arr=new int[n];
        inputArray(arr);
        displayArray(arr);
        int k=sc.nextInt();
        rotateArray(arr,k);
        //reverseArray(arr,0,n-1);
        displayArray(arr);
    }
}

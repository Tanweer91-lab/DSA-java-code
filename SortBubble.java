import java.util.Scanner;
public class SortBubble {
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
    static void bubbleSort(int[] arr){
           int n=arr.length;
           for(int i=0;i<n-1;i++){
               for(int j=0;j<n-1-i;j++){
                   if(arr[j]>arr[j+1]){
                       int temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                   }
               }
           }
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        displayArray(arr);
        bubbleSort(arr);
        displayArray(arr);
    }
}

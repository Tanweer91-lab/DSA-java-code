//Selection Sort  timeComplexity O(n^2) and space O(1)
import java.util.Scanner;
public class SelectionSort {
    static void selectionSort(int[] arr){
         int n=arr.length;
         for(int i=0;i<n-1;i++){
             int minIndex=i;
             for(int j=i+1;j<n;j++){
                 if(arr[minIndex]>arr[j]){
                     minIndex=j;
                 }
             }
             if(minIndex!=i){
                MyArray.swapElement(arr,minIndex,i);
             }
         }
    }
    static void selectionSort2(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int maxIndex=0;
            for(int j=0;j<n-i;j++){
                if(arr[maxIndex]<arr[j]){
                    maxIndex=j;
                }
            }
            MyArray.swapElement(arr,maxIndex,n-1-i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        MyArray.printArray(arr);
//        selectionSort(arr);
         selectionSort2(arr);
        MyArray.printArray(arr);

    }
}

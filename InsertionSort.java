import java.util.Scanner;
public class InsertionSort {
    static void  insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                MyArray.swapElement(arr,j,j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        MyArray.printArray(arr);
        insertionSort(arr);
        MyArray.printArray(arr);

    }
}

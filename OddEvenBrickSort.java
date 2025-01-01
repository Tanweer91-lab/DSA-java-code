import java.util.*;
public class OddEvenBrickSort {
    public static void brickSort(int[] arr){
        int n=arr.length;
        boolean isSorted=false;
        while(!isSorted){
            int temp=0;
            isSorted=true;
            for(int i=1;i<n-1;i+=2){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    isSorted=false;
                }
            }
            for(int i=0;i<n-1;i+=2){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    isSorted=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        MyArray.inputArray(arr);
        MyArray.printArray(arr);
        brickSort(arr);
        MyArray.printArray(arr);
    }
}

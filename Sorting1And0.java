// Sorting 0 and 1 in  an array.
import java.util.Scanner;
public class Sorting1And0 {
    static void sort0And1(int[] arr){
        int n= arr.length;
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==zero){
                zero++;
            }
        }
        for(int i=0;i<n;i++){
            if(zero>0){
                arr[i]=0;
                zero--;
            }else{
                arr[i]=1;
            }
        }
    }
    static void sort0And1Aproach(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==1&&arr[j]==0){
                arr[i++]=0;
                arr[j--]=1;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
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
        sort0And1Aproach(arr);
        MyArray.printArray(arr);
    }
}

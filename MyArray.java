import java.util.Scanner;
public class MyArray {
    static Scanner sc=new Scanner(System.in);
    public static void inputArray(int[] arr){
           int n=arr.length;
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
    }
    public static void printArray(int[] arr){
          for(int i:arr){
              System.out.print(i+" ");
          }
         System.out.println();
    }
    public static void swapElement(int[] arr,int i,int j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
    }

}

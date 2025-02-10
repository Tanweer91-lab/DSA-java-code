import java.util.Scanner;
public class Demo {
    static void func(int[] brr){
         brr[0]=-5;
         brr[1]=-10;
        System.out.println(brr[0]);
        System.out.println(brr[1]);
    }
    public static void main(String[] args) {
        int[] arr =new int[2];
        arr[0]=5;
        arr[1]=10;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        func(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

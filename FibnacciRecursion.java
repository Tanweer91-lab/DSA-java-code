import java.util.Scanner;
public class FibnacciRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fibnacci(n);
        System.out.println(ans);
    }
    static int fibnacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
//        int pre=fibnacci(n-1);
//        int prePre=fibnacci(n-2);
        return fibnacci(n-1)+fibnacci(n-2);
    }
}

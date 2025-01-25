import java.util.Scanner;
public class PrintNTo1Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDec(n);
    }
    static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
}

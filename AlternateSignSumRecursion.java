import java.util.Scanner;
public class AlternateSignSumRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(alternateSum(n));
    }
    static int alternateSum(int n){
        if(n==0){
            return 0;
        }
        int smallAns=alternateSum(n-1);
        if(n%2==0){
            return smallAns-n;
        }else{
            return smallAns+n;
        }
    }

}

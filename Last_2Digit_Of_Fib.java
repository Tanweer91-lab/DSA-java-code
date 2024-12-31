import java.util.Scanner;
public class Last_2Digit_Of_Fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term");
        int n=sc.nextInt();
        int f=1,l=1;
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=(l+f)%100;
            l=f;
            f=ans;
        }
        System.out.println(f);
    }
}

import java.util.Scanner;
public class SumDigitsRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=sumDigit(n);
        System.out.println(ans);
    }
    static int sumDigit(int n){
      if(n==0) {
          return 0;
      }
//      int smallAns=sumDigit(n/10);
//      int ans=n%10+smallAns;
      return sumDigit(n/10)+n%10;
    }
}

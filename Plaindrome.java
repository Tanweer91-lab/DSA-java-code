import java.util.Scanner;
 class IsPalindrome{
       public static boolean isPalindrome(int n){
              int temp=n;
              int rev=0;
              while(temp>0){
                  rev=rev*10+temp%10;
                  temp/=10;
              }
              if(rev==n){
                  return true;
              }
              return false;
       }

}
public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        IsPalindrome obj=new IsPalindrome();

        if(obj.isPalindrome(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

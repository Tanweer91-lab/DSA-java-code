import java.sql.SQLOutput;
import java.util.*;
public class Print_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String rev="";
//        while(n>0){
//            int d=n%10;
//            rev=rev+""+d;
//            n/=10;
//        }
//        System.out.println(rev);
//        for(int i=rev.length()-1;i>=0;i--){
//            System.out.println(rev.charAt(i));
//        }
         int n=sc.nextInt();
         int temp=n;
         int rev=0,count=0,d=0;
         while(temp>0) {
             d = temp % 10;
             rev = rev * 10 + d;
             temp /= 10;
             count++;
         }
        System.out.println(rev);
         d=0;
         for(int i=count;i>0;i--){
             d=rev%10;
             System.out.println(d);
             rev/=10;
         }


    }
}

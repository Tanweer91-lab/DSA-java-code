import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long bn=sc.nextLong();
        long ans=0;
        int i=0;
        while(bn>0){
            ans=ans+((bn%10)*(long)(Math.pow(2,i)));
            i++;
            bn/=10;
        }
        System.out.println(ans);
    }
}

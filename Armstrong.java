import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static boolean isArmstrong(int n){
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int ans=0;
        temp=n;
        while(temp>0){
            int d=temp%10;
            ans=ans+((int)Math.pow(d,count));
            temp/=10;
        }
        return ans==n?true:false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isArmstrong(n)){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}

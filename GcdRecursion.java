import java.util.Scanner;
public class GcdRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans= gcd2(x,y);
        System.out.println(ans);
    }
    static int gcd(int x,int y){
        int ans=1;
        for(int i=1;i<=x;i++){
            if(x%i==0&&y%i==0){
                ans=i;
            }
        }
        return ans;
    }
    static int gcd1(int x,int y){
          while(x>0) {
             int rem=y%x;
             y=x;
             x=rem;
          }
          return y;
    }
    static int gcd2(int x,int y){
        if(x==0){
            return y;
        }
        return gcd2(y%x,x);
    }
}

import java.util.Scanner;
public class PowerPQRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int ans=power2(p,q);
        System.out.println(ans);
    }
    static int power1(int p,int q){
        if(q==0){
            return 1 ;
        }
//        int smallAns=power(p,q-1);
//        int ans=p*smallAns;
       // return ans;
        return power1(p,q-1)*p;

    }
    static int power2(int p,int q){
        if(q==0){
            return 1;
        }
        int res=power2(p,q/2);
        if(q%2!=0){
            return res*res*p;
        }else {
            return res * res;
        }
    }
}

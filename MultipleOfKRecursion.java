import java.util.Scanner;
public class MultipleOfKRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        multiple(num,k);
    }
    static void multiple(int num,int k){
        if(k==1){
            System.out.print(num+" ");
            return;
        }
        multiple(num,k-1);
        System.out.print(num*k+" ");
    }

}

import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            // for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            // for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //printing star
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

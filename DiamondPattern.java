import java.sql.SQLOutput;
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++) {
            int n = sc.nextInt();
            n = n + 1;
            for (int i = 1; i <= n / 2; i++) {
                for (int j = 1; j <= n / 2 - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = n / 2 - 1; i >= 1; i--) {
                for (int j = n / 2 - 1; j >= i; j--) {
                    System.out.print("  ");
                }
                for (int j = 2 * i - 1; j >= 1; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

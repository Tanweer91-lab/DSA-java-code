import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pre=-1,curr=1,ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    ans=pre+curr;
                    pre=curr;
                    curr=ans;
                    System.out.print(ans+" ");
                }
            System.out.println();
            }

        }
    }


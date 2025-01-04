import java.util.*;

public class ToggleString{

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        toggleCase(n, str);
    }

    static void toggleCase(int n, String str) {
        // your code here
        String ans="";
        for(int i=0;i<n;i++){
            int ch=str.charAt(i);
            if(ch>=65&&ch<=90){
                ans=ans+""+(char)(ch+32);
            }else if(ch>=97&&ch<=122){
                ans=ans+""+(char)(ch-32);
            }else{
                ans+=(char)(ch);
            }

        }
        System.out.println(ans);
    }
}

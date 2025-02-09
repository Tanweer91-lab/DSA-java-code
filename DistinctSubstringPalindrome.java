import java.util.*;

public class DistinctSubstringPalindrome{
    static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    static void palindromeSubStrs(String s) {
        //Write your code here
        ArrayList<String> res=new ArrayList<String>();
        int n=s.length();
        for(int i=0;i<n;i++){
            String ans="";
            for(int j=i;j<n;j++){
                ans+=s.charAt(j);
                res.add(ans);
            }
        }
        Collections.sort(res);
        System.out.println(res);
        // int size=res.size();
        for(int i=1;i<res.size();i++){
            if(res.get(i).equals(res.get(i-1))){
                res.remove(i);
                System.out.println(res.size());
                i--;
            }
        }
        System.out.println(res);
        //System.out.println(res);

        //    for(String i:res){
        //     if(isPalindrome(i)){
        //         System.out.println(i);
        //     }
        //    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}

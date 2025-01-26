public class PalindromeStringRecursion {
    public static void main(String[] args) {
        String str="abba";
        System.out.println(palindrome(str,0,str.length()-1)?"yes":"no");
    }
    static boolean palindrome(String str,int i,int j){
        if(i>j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        return palindrome(str,i+1,j-1);
    }

}

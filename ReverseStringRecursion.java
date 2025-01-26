public class ReverseStringRecursion {
    public static void main(String[] args) {
        String str="tanweer raza";
        System.out.println(reverse(str,str.length()-1,""));
    }
    static String reverse(String str,int idx,String asf){
        if(idx==-1){
            return asf;
        }
        asf+=str.charAt(idx);
        return reverse(str,idx-1,asf);
    }
}

import java.util.Scanner;
public class RemoveAFromStringRecursion {
    public static void main(String[] args) {
        String str="tanweer_raza";
        System.out.println(removeA(str,0,""));
    }
    static  String removeA(String str,int idx,String asf){
           if(idx==str.length()){
               return asf;
           }
           if(str.charAt(idx)!='a'){
               asf+=str.charAt(idx);
           }
           return removeA(str,idx+1,asf);
    }
}

public class PrintAllSubsequenceRecursion {
    public static void main(String[] args) {
        String str="abc";
        printAllSubsequence(str,0,"");
    }
    static void printAllSubsequence(String str,int idx,String asf){
           if(idx==str.length()){
               System.out.print(asf+" ");
               return;
           }
           printAllSubsequence(str,idx+1,asf+str.charAt(idx));
           printAllSubsequence(str,idx+1,asf);
    }
}

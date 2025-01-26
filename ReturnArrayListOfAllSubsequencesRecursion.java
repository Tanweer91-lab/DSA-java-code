import java.util.ArrayList;

public class ReturnArrayListOfAllSubsequencesRecursion {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ans=new ArrayList<>();
        allSubsequence1(str,0,ans,"");
        System.out.println(ans);
    }
    static ArrayList<String> allSubsequence(String str){
        ArrayList<String> ans=new ArrayList<>();
        if(str.length() ==0){
            ans.add("");
            return ans;
        }
        char curr=str.charAt(0);
        ArrayList<String> smallAns=allSubsequence(str.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr+ss);

        }
        return ans;
    }
    static void allSubsequence1(String str,int idx,ArrayList<String> ans,String asf){

            if(idx==str.length()) {
                if(asf.length()!=0)
                ans.add(asf);
                return;
            }
            allSubsequence1(str,idx+1,ans,asf+str.charAt(idx));
            allSubsequence1(str,idx+1,ans,asf);



    }

}

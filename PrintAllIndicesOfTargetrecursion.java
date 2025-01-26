import java.util.ArrayList;

public class PrintAllIndicesOfTargetrecursion {
    public static void main(String[] args) {
        int[] arr={2,1,3,2,2,5};
        int x=2;
        ArrayList<Integer> ans= new ArrayList<>();
        printAll1(arr,x,0,ans);
        System.out.println(ans);
    }
    static void printAll(int[] arr,int x,int idx){
         if(idx==arr.length){
             return;
         }
         if(arr[idx]==x){
             System.out.print(idx+" ");
         }
         printAll(arr,x,idx+1);
    }
    static void printAll1(int[] arr, int x, int idx, ArrayList<Integer> ans){
           if(idx==arr.length){
               return;
           }
           if(arr[idx]==x){
               ans.add(idx);
           }
           printAll1(arr,x,idx+1,ans);
    }
}

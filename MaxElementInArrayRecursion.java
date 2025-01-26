//import java.util.Scanner;
public class MaxElementInArrayRecursion {
    public static void main(String[] args) {
        int[] arr={340,500,1200,100,100};
        int ans=maxEle(arr,0);
        System.out.println(ans);
    }
    static int maxEle(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
//        int smallAns=maxEle(arr,idx+1);
//        if(arr[idx]>smallAns){
//            return arr[idx];
//        }else{
//            return smallAns;
//        }
        //return arr[idx]>maxEle(arr,idx+1)?arr[idx]:maxEle(arr,idx+1);
        return Math.max(arr[idx],maxEle(arr,idx+1));
    }
}

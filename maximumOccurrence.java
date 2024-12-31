import java.util.*;
public class maximumOccurrence {
    public static void main(String[] args) {
        int[] arr={1,3,1,2,4,2,2};
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        int newCount=1;
        int ans=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(newCount>count){
                    count=newCount;
                    ans=arr[i-1];
                }
                newCount=1;
            }else{
                newCount++;
            }
        }
        if(newCount>count){
            ans=arr[n-1];
        }
        System.out.println(ans);
    }
}

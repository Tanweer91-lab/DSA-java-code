public class SumOfSubsetsArrayRecursion {
    public static void main(String[] args) {
        int[] arr={2,4,5};
        sumSubsets(arr,0,0);
    }
    static void sumSubsets(int[] arr,int idx,int sum){
        if(idx==arr.length){
            System.out.print(sum+" ");
            return;
        }
        sumSubsets(arr,idx+1,sum+arr[idx]);
        sumSubsets(arr,idx+1,sum);
    }

}

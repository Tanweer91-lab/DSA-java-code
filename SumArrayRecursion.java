public class SumArrayRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,100,5};
        System.out.println(sumArray(arr,0));
    }
    static int sumArray(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        return sumArray(arr,idx+1)+arr[idx];
    }

}

public class IsSortedArrayRecursion {
    public static void main(String[] args) {
        int[] arr={200,100,50,40,30};
        System.out.println(isSorted(arr,1)?"yes":"no");
    }
    static boolean isSorted(int[] arr,int idx){
        if(idx==arr.length){
            return true;
        }
        if(arr[idx]<arr[idx-1]){
            return false;
        }
        return isSorted(arr,idx+1);
    }
}

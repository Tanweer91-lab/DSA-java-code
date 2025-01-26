public class PrintLastIndexOfTargetInArrayRecursion {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7,8};
        int x=2;
        System.out.println(printLast(arr,x,arr.length-1));
    }
    static int printLast(int[] arr,int x,int idx){
        if(idx==-1){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        return printLast(arr,x,idx-1);
    }
}

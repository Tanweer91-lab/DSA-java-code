
public class TargetInArray {
    public static void main(String[] args) {
        int[] arr={3,100,4,5,39};
        int target=1000;
        System.out.println(findTarget(arr,target,0)?"yes":"No");
    }
    static boolean findTarget(int[] arr,int target,int idx){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        return findTarget(arr,target,idx+1);
    }
}

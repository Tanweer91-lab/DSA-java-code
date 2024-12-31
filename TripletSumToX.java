import java.util.ArrayList;
import java.util.Scanner;
public class TripletSumToX {
    static int countTriplets(ArrayList<Integer> arr,int x){
//        int count=0;
//        int n=arr.size();
//        for(int i=0;i<n-2;i++){
//            for(int j=i+1;j<n-1;j++){
//                for(int k=j+1;k<n;k++){
//                    int add=arr.get(i)+arr.get(j)+arr.get(k);
//                    if(add==x){
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
         int n=arr.size();
         int[] temp=new int[3];
         int count=0;
          for(int i=0;i<n-2;i++){
              int left=i+1;
              int right=n-1;
              while(left<right){
                  int add=arr.get(i)+arr.get(left)+arr.get(right);
                  if(add==x&&(temp[0]!=arr.get(i)||arr.get(left)!=temp[1]||arr.get(right)!=temp[2])){
                      temp[0]=arr.get(i);
                      temp[1]=arr.get(left);
                      temp[2]=arr.get(right);
                      count++;
                      left++;
                      right--;

                  }else if(add<x){
                      left++;
                  }else{
                      right--;
                  }
              }

          }
          return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int x=sc.nextInt();
        System.out.println(countTriplets(arr,x));
    }
}

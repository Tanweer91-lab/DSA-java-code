import java.util.Scanner;

public class SubtractTwoArray {
    static Scanner sc=new Scanner(System.in);
    public static void inputArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void displayArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int[] subtractTwoArray(int[] a,int[] b) {
         int n=a.length,m=b.length;
         long sum1=0;
         for(int i=0;i<n;i++){
             sum1=sum1*10+(a[i]);
         }
         long sum2=0;
         for(int i=0;i<m;i++){
             sum2=sum2*10+b[i];
         }
         long diff=sum1-sum2;
         long temp=0;
         boolean neg=false;
         if(diff<0){
             temp=-1*diff;
             neg=true;
         }else{
             temp=diff;
         }

         int count=0;
         while(temp>0){
              temp/=10;
              count++;
         }
         int[] ans=new int[count];
         int i=count-1;
         for(int j=0;j<count;j++){
              if(neg) {
                  if(j!=count-1) {
                      ans[i--] = -1 * (int) (diff % 10);
                      diff /= 10;
                  }else{
                      ans[i--] = (int) (diff % 10);
                      diff /= 10;
                  }
              }else{
                  ans[i--] = (int) (diff % 10);
                  diff /= 10;
              }
         }
         return ans;
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] a=new int[n];
        inputArray(a);
        int m=sc.nextInt();
        int[] b=new int[m];
        inputArray(b);
        displayArray(a);
        displayArray(b);
        int[] res=subtractTwoArray(a,b);
        displayArray(res);



    }
}

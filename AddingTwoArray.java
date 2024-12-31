import java.util.Scanner;
public class AddingTwoArray {
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
  public static int[] addTwoArray(int[] a,int[] b,int n,int m) {
      long sum = 0;
      for (int i = 0; i < n; i++) {
          sum = sum * 10 + a[i];
      }
      long sum2=0;
      for(int i=0;i<m;i++){
         sum2=sum2*10+b[i];
      }
     long ans=sum+sum2;
      sum=ans;
      int count=0;
      while(sum>0) {
          sum /= 10;
          count++;
      }
      int[] res=new int[count];
      int i=count-1;
      while(ans>0){
          res[i--]=(int)(ans%10);
          ans/=10;
      }
      return res;

  }


    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        inputArray(a);
        int m=sc.nextInt();
        int[] b=new int[m];
        inputArray(b);
        displayArray(a);
        displayArray(b);
        int[] res=addTwoArray(a,b,n,m);
        displayArray(res);


    }
}

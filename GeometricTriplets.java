import java.util.Scanner;
public class GeometricTriplets{
    static Scanner sc=new Scanner(System.in);
    static void inputArray(int[ ]arr){
         int n=arr.length;
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
    }
    static void displayArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void findGeometricTriplets(int[] arr,int n){
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]*arr[k]==arr[j]*arr[j]){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] arr=new int[n];
        inputArray(arr);
        displayArray(arr);
        findGeometricTriplets(arr,n);
    }
}

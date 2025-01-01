
    import java.io.*;
import java.util.*;
import java.lang.Math;
    public class CountSwap {
        static String arraySwaps(int arr[],int n,int x)
        {
            // Your code here
            int count=0;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                    if(Math.abs(arr[j]-arr[(j+1)])>=x){
                        if(arr[j]>arr[j+1]){
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                            count++;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(count);
            if(count==0){
                return "NO";
            }
                return "YES";

        }
        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int x = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            String ans = arraySwaps(a,n,x);
            System.out.println(ans);
        }
    }

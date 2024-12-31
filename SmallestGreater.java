import java.util.*;
public class SmallestGreater {
        public static int[] SmallestGreaterElements(int[] arr) {
            // Write your code here
            int n=arr.length;
            int[] temp=new int[n];
            for(int i=0;i<n;i++){
                temp[i]=arr[i];
            }
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                    if(temp[j]>temp[j+1]){
                        int var=temp[j];
                        temp[j]=temp[j+1];
                        temp[j+1]=var;
                    }
                }
            }
            for(int i=0;i<n;i++){
                int index=0;
                while(index<n&&temp[index]<=arr[i]){
                    index++;
                }
                if(index<n){
                    arr[i]=temp[index];
                }else{
                    arr[i]=-10000000;
                }
            }

            return arr;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int[] ans = SmallestGreaterElements(arr);
            for(int a : ans) {
                System.out.print(a + " ");
            }
        }
    }


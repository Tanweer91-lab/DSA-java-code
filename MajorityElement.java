import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }

        int[] temp=new int[n+1];
        for(int i=0;i<n;i++){
            temp[arr[i]]++;
        }
       System.out.println(Arrays.toString(temp));
        for(int i=0;i< temp.length;i++){
            if(temp[i]>=((n/2)+1)){
                System.out.println(temp[i]);
                System.out.println(i);
            }
        }
    }
}

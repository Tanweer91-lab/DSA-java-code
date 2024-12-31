
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class NumberRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int temp=n;
        int count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        if(k<0){
            k=count+k;
        }
        k=k%count;
        int firstPart=0;
        int secondPart=0;
        for(int i=1;i<=k;i++){
            firstPart=firstPart*10+(n%10);
            secondPart=(n/10);
            n/=10;
        }
        int revFirstPart=0;
        while(firstPart>0){
            revFirstPart=revFirstPart*10+(firstPart%10);
            firstPart/=10;
        }

//        System.out.println(revFirstPart+" "+secondPart);
        for(int i=1;i<=count-k;i++){
            revFirstPart*=10;
        }
        //System.out.println(revFirstPart);
        System.out.println(revFirstPart+secondPart);

        //System.out.println(count);
    }
}

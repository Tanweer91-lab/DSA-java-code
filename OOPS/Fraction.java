package OOPS;

public class Fraction {
    public static FractionClass add(FractionClass f1,FractionClass f2){
        int num=f1.num*f2.deno+f2.num*f1.deno;
        int deno=f1.deno*f2.deno;
         f1=new FractionClass(num,deno);
        return f1;
    }
    public static FractionClass multiply(FractionClass f1,FractionClass f2){
        int num=f1.num*f2.num;
        int deno=f1.deno*f2.deno;
        FractionClass f3=new FractionClass(num,deno);
        return f3;
    }
    public static FractionClass subtract(FractionClass f1,FractionClass f2){
        int num=f1.num*f2.deno-f2.num*f1.deno;
        int deno=f1.deno*f2.deno;
        FractionClass f3=new FractionClass(num,deno);
        return f3;
    }
    public static int gcd(int num,int deno){
        while(num>0){
            int rem=deno%num;
            deno=num;
            num=rem;
        }
        return deno;
    }
    public static class FractionClass{
        int num;
        int deno;
        FractionClass(int num,int deno){
            this.num=num;
            this.deno=deno;
            simplify();
        }
        void simplify(){
            int hcf=gcd(num,deno);
            num/=hcf;
            deno/=hcf;
        }
    }
    public static void main(String[] args) {
        FractionClass f1=new FractionClass(35,7);
        System.out.println(f1.num+"/"+f1.deno);
        FractionClass f2=new FractionClass(12,3);
        System.out.println(f2.num+"/"+f2.deno);
        FractionClass f3=add(f1,f2);
        System.out.println(f3.num+"/"+f3.deno);
//        FractionClass f4=multiply(f1,f2);
//        System.out.println(f4.num+"/"+f4.deno);
//        FractionClass f5=subtract(f1,f2);
//        System.out.println(f5.num+"/"+f5.deno);
    }
}

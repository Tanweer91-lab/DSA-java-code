package OOPS;

import java.util.Arrays;

public class MyArrayList {
    public static class Arraylist{
         int[] arr=new int[2];
         int idx=-1;
         void add(int ele){
             if(arr.length==idx){
                 int[] brr= Arrays.copyOf(arr,arr.length*2);
                 arr=brr;
             }
             if(idx<0){
                 idx++;
             }
             arr[idx]=ele;
             idx++;
         }
         int size(){
             return idx;
         }
         int get(int idx) {
             if(idx==size()){
                 return -1;
             }
             return arr[idx];
         }
    }
    public static void main(String[] args) {
        Arraylist arr=new Arraylist();
        arr.add(1);
        arr.add(200);
        //print(arr);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        arr.add(1000);
        System.out.println(arr.get(3));
        System.out.println(arr.size());
    }
}

package LinkedList;

import java.sql.SQLOutput;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class basicsLinkedList {
    public static void insertAtEnd(Node head,int data){
         Node temp=new Node(data);
         Node t=head;
         while(t.next!=null){
             t=t.next;
         }
         t.next=temp;
    }
    public static void display(Node head){
         while(head!=null){
             System.out.print(head.data+" ");
             head=head.next;
         }
    }
    public static void displayRecursion(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        displayRecursion(head.next);
    }
    public static void displayReverse(Node head){
        if(head==null){
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static int length(Node head){
         int count=0;
         while(head!=null){
             count++;
             head=head.next;
         }
         return count;
    }
    public static void main(String[] args) {
         Node a=new Node(5);
         Node b=new Node(6);
         Node c=new Node(7);
         Node d=new Node(8);
         Node e=new Node(9);
         Node f=new Node(100);
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         //********************--------------------*************
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);
         //*******-------------------------------------**********
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

//          Node temp=a;
//          for(int i=1;i<=5;i++){
//              System.out.print(temp.data+" ");
//              temp=temp.next;
//          }
//        System.out.println();
//        Node temp1=a;
//        while(temp1!=null){
//            System.out.print(temp1.data+" ");
//            temp1=temp1.next;
//        }
          display(a);
        System.out.println();
        displayRecursion(a);
        System.out.println();
        displayReverse(a);
        System.out.println();
        System.out.println(length(a));
        insertAtEnd(a,111);
        display(a);
    }
}

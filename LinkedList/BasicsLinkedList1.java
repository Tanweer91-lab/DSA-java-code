package LinkedList;
public class BasicsLinkedList1 {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void display(Node head){
         while(head!=null){
             System.out.print(head.data+" ");
             head=head.next;
         }
        System.out.println();
    }
    static void displayRecursion(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        displayRecursion(head.next);
    }
    static void displayReverse(Node head){
           if(head==null){
               return;
           }
           displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    static int length(Node head){
         int count=0;
         while(head!=null){
             count++;
             head=head.next;
         }
         return count;
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(15);
        Node d=new Node(20);
        Node e=new Node(25);
        Node f=new Node(30);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);
//        System.out.println(f.data);
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);
//        System.out.println(a.next.next.next.next.next.data);
//
//         for(int i=1;i<=6;i++){
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//        Node temp=a;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//         display(a);
//         displayRecursion(a);
//        System.out.println();
//         displayReverse(a);
        System.out.println(length(a));
        Node g=new Node(350);
        f.next=g;
        System.out.println(length(a));

    }
}

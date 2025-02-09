package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class basicsLinkedList {
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
    public static void main(String[] args) {
         Node a=new Node(5);
         Node b=new Node(6);
         Node c=new Node(7);
         Node d=new Node(8);
         Node e=new Node(9);
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
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
    }
}

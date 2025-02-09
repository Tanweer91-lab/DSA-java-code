package LinkedList;
public class ImplementationOfLinkedList {
    static class Node{
         int data;
         Node next;
         Node(int data){
             this.data=data;
         }
     }
    static class Linkedlist{
         Node head=null;
         Node tail=null;
         int size=0;
         void insertAtEnd(int data){
             Node temp=new Node(data);
             if(head==null){
                 head=temp;
             }else {
                 tail.next = temp;
             }
             tail=temp;
             size++;
         }
         void insertAtBegining(int data){
             Node temp=new Node(data);
             if(head==null){
                 head=temp;
                 tail=temp;
             }else{
                 temp.next=head;
                 head=temp;
             }
             size++;
         }
         void display(){
             Node temp=head;
             while(temp!=null){
                 System.out.print(temp.data+" ");
                 temp=temp.next;
             }
             System.out.println();
         }
//         int size(){
//             Node temp=head;
//             int count=0;
//             while(temp!=null){
//                 count++;
//                 temp=temp.next;
//             }
//            return count;
//         }
         void insertAt(int idx,int data){
             Node t=new Node(data);
             Node temp=head;
             if(idx==size){
                 insertAtEnd(data);
                 return;
             }else if(idx==0){
                 insertAtBegining(data);
                 return;
             }else if(idx<0||idx>size){
                 System.out.println("wrong index");
                 return;
             }
             for(int i=1;i<=idx-1;i++){
                 temp=temp.next;
             }
             t.next=temp.next;
             temp.next=t;
             size++;
         }
         int getAt(int idx){
             Node temp=head;
             if(idx<0||idx>=size){
                 System.out.println("Wrong index");
                 return -1;
             }
             for(int i=1;i<=idx;i++){
                 temp=temp.next;
             }
             return temp.data;
         }
         void deleteAt(int idx){
             if(idx==0){
                 head=head.next;
                 size--;
                 return;
             }
             Node temp=head;
             for(int i=1;i<=idx-1;i++){
                 temp=temp.next;
             }
             temp.next=temp.next.next;
             if(idx==size-1){
                 tail=temp;
             }
             size--;
         }
     }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(10);
        //ll.display();
       // System.out.println(ll.size);
        ll.insertAtEnd(34);
        ll.insertAtEnd(100);
       // System.out.println(ll.size);
       // ll.display();
        ll.insertAtBegining(200);
        //ll.display();
        ll.insertAt(1,300);
        //ll.display();
        //ll.insertAt(6,1000);
        //ll.display();
        //System.out.println(ll.tail.data);
        //ll.insertAt(8,450);
        //ll.display();
       // System.out.println(ll.getAt(-1));
        //System.out.println(ll.size);
        ll.display();
        ll.deleteAt(4);
        ll.display();
        ll.deleteAt(1);
        ll.display();
        ll.deleteAt(3);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.size);
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.size);
        ll.deleteAt(1);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.size);
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.size);

    }
}

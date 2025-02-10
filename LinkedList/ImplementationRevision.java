package LinkedList;

public class ImplementationRevision {
      static class Node{
          int data;
          Node next;
          Node(int data){
              this.data=data;
          }
      }
      static class Ll{
          Node head=null;
          Node tail=null;
          int size=0;
          void insertAtEnd(int data){
             Node temp=new Node(data);
             if(head==null){
                 head=temp;
             }else{
                 tail.next=temp;
             }
             tail=temp;
             size++;
          }
          void insertAtStart(int data){
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
          void insertAt(int idx,int data){
              Node t=new Node(data);
              Node temp=head;
              if(idx==0){
                  insertAtStart(data);
                  return;
              }
              if(idx==size){
                  insertAtEnd(data);
                  return;
              }
              if(idx<0||idx>size){
                  System.out.println("Wrong index");
                  return;
              }
              for(int i=1;i<=idx-1;i++){
                  temp=temp.next;
              }
              t.next=temp.next;
              temp.next=t;
              size++;
          }
          void delete(int idx){
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
          int get(int idx){
              if(idx<0||idx>=size){
                 return -1;
              }
              Node temp=head;
              for(int i=1;i<=idx;i++){
                  temp=temp.next;
              }
              return temp.data;
          }
          void display(){
              Node temp=head;
              while(temp!=null){
                  System.out.print(temp.data+" ");
                  temp=temp.next;
              }
              System.out.println();
          }
//          int size(){
//              Node temp=head;
//              int count=0;
//              while(temp!=null){
//                  count++;
//                  temp=temp.next;
//              }
//              return count;
//          }
}

    public static void main(String[] args) {
        Ll t=new Ll();
        t.insertAtEnd(5);
        t.insertAtEnd(10);
        t.insertAtEnd(15);
        t.insertAtEnd(20);
       // t.display();
       // System.out.println(t.size());
        t.insertAtEnd(100);
       // t.display();
       // System.out.println(t.size());
        t.insertAtStart(-20);
        // t.display();
         t.display();
         t.insertAt(1,111);
         t.display();
         t.insertAt(5,222);
         t.display();
         t.insertAt(0,1000);
         t.display();
         t.insertAt(9,0);
         t.display();
         t.insertAt(-1,100);
         t.insertAt(11,10000);
        System.out.println(t.size);
        t.delete(0);
        t.display();
        t.delete(7);
        t.display();
        System.out.println(t.size);
        t.delete(7);
        t.display();
        System.out.println(t.size);
        t.delete(2);
        t.display();
        System.out.println(t.size);
        System.out.println(t.get(-1));


    }
}

// class node{
//     int val;
//     node next;
//     node(int val){
//         this.val =val;
//     }
// }

// public class basicll {
//     public static void main(String[] args) {
//         node temp=head;
//         while( temp != null){
//             System.out.println(temp.val+" ");
//             temp=temp.next;
//         }
//         node a= new node(10); 
//         node b= new node(20);
//         node c= new node(30); 
//         node d= new node(40); 
//         node e= new node(50); 
//         //coonect ll
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
// System.out.println(a.next);
// System.out.println(a.val);
//     }
// }



class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
class linkedlist{
    node head;
    node tail;


    void addAtHead(int val){
        node temp = new node(val);
        if(head==null) head =tail =temp;
        else{
            temp.next =head;
            head =temp;
        }
    }
    void addAtTail(int val){
        node temp = new node(val);
   if(tail==null) head = tail = temp;
   else{
    tail.next=temp;
    tail=temp;
   }
    }
    void deleteAthead(){
        if(head==null) return;
        node temp =head;
        while(temp !=null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void display (){
        if(head==null) return;
        node temp =head;
        while(temp !=null){
            System.out.print(temp.val+"->");
            temp= temp.next;

        }
        System.out.println();
    }
}
public class basicll {
public static void main(String[] args) {
 linkedlist ll =new linkedlist();
   ll.addAtHead(10);
   ll.addAtHead(20);
   ll.addAtHead(30);
   ll.addAtHead(40);
   
   ll.addAtTail(50);
  

   ll.deleteAthead();
   ll.display();
}
}

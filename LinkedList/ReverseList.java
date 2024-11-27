
public class ReverseList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
          this.data=data;
          this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       head=prev;
    }
    
public static void main(String[] args) {
    ReverseList list=new ReverseList();
    list.addFirst(2);
    list.addFirst(1);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);

    list.print();

    list.reverse();
    list.print();

}
    
}
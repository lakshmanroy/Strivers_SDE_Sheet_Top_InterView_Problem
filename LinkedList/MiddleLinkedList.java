// package LinkedList;

public class MiddleLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public Node  middleOfLinkedLists(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
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
    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        MiddleLinkedList  ll=new MiddleLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        Node middlNode=ll.middleOfLinkedLists();
        ll.print(middlNode);
    }
}

// package LinkedList_And_Arrays;

public class RotateList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;

    public static Node rotateRight(Node head,int k){
        if(head==null || head.next==null || k==0){
            return head;
        }
        Node current=head;
        int length=1;
        while(current.next!=null){
            current=current.next;
            length++;
        }
        current.next=head;

        k=k%length;
        int StepnewHead=length-k;
        Node newTail=head;
        for(int i=1;i<StepnewHead;i++){
            newTail=newTail.next;
        }
        Node newHead=newTail.next;
        
        newTail.next=null;
        return newHead;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        int k=2;

        Node rotateList=rotateRight(head, k);
        System.out.println("Rotated list:");
        print(rotateList);
    }
}

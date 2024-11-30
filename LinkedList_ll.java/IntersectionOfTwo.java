public class IntersectionOfTwo {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node gernerate(Node headA,Node headB){
         Node partA=headA;
         Node partB=headB;
         while(partA!=partB){
            partA=(partA==null)? headB:partA.next;
            partB=(partB==null)?headA:partB.next;
         }
         return partA; 
    }
    public static void main(String[] args) {
        Node head=new Node(8);
        head.next=new Node(4);
        head.next.next=new Node(5);

        Node listA=new Node(4);
        listA.next=new Node(1);
        listA.next.next=head;

        Node listB=new Node(5);
        listB.next=new Node(6);
        listB.next.next=new Node(1);
        listB.next.next.next=head;

        IntersectionOfTwo ll=new IntersectionOfTwo();
        Node result=ll.gernerate(listA, listB);

       System.out.println(result != null ? "Intersected at '" + result.data + "'" : "No intersection");
        
    }
}

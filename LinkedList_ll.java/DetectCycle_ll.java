public class DetectCycle_ll {
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

    public static Node detectCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                while(head!=slow){
                  head=head.next;
                  slow=slow.next;
                }
                return slow;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        head=new Node(3);
        head.next=new Node(2);
        head.next.next=new Node(0);
        head.next.next.next=new Node(-4);

        head.next.next.next.next=head.next;

        Node cycleStart= detectCycle();

        if(cycleStart!=null){
            System.out.println("cycle detected at :"+cycleStart.data);
        }
        else{
            System.out.println("No cycle detected");
        }
    }
}

public class DeleteNode{
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

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void deleteNodes(Node node) {
        if (node != null && node.next != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);

        DeleteNode list = new DeleteNode();
        Node nodeToDelete = head.next; // Node with value 5
        deleteNodes(nodeToDelete);
        list.print();
    }
}
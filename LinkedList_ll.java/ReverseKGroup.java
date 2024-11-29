public class ReverseKGroup {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseKGroup(Node head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to simplify edge cases
        Node dummy = new Node(0);
        dummy.next = head;

        Node prevGroupEnd = dummy;

        while (true) {
            // Find the kth node from the current group
            Node kthNode = getKthNode(prevGroupEnd, k);
            if (kthNode == null) break; // If less than k nodes remain, stop

            // Identify the next group's start
            Node nextGroupStart = kthNode.next;

            // Reverse the current group
            Node groupStart = prevGroupEnd.next;
            reverseGroup(groupStart, nextGroupStart);

            // Update the connections
            prevGroupEnd.next = kthNode; // kthNode becomes the new group's head
            groupStart.next = nextGroupStart; // groupStart becomes the new group's tail

            // Move prevGroupEnd to the end of the current group
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }

    // Helper method to get the kth node from the current position
    private static Node getKthNode(Node start, int k) {
        while (start != null && k > 0) {
            start = start.next;
            k--;
        }
        return start;
    }

    // Helper method to reverse nodes in a group
    private static void reverseGroup(Node start, Node end) {
        Node prev = null, current = start;
        while (current != end) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }

    // Helper method to print the list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k = 2;

        System.out.println("Original List:");
        print(head);

        Node newHead = reverseKGroup(head, k);

        System.out.println("Reversed in Groups of " + k + ":");
        print(newHead);
    }
}

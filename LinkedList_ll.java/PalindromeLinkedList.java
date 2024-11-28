public class PalindromeLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is the mid node
    }
    
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true; // Single node or empty list is always a palindrome
        }

        // Step 1: Find the middle of the list
        Node midNode = findMid(head);

        // Step 2: Reverse the second half of the list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // Start of reversed second half
        Node left = head;  // Start of the first half

        // Step 3: Check if the left and right halves are equal
        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        PalindromeLinkedList list = new PalindromeLinkedList();

        System.out.println("Original List:");
        list.print();

        boolean isPalindrome = list.checkPalindrome();
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

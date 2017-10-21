public class SinglyLinkedList {

    private static class Node {

        private int data;
        private Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public Node nthToLast(Node node, int n) {

        Node curr = node;
        Node follower = node;

        for (int i = 0; i < n; i++) {

            if (curr == null) return null;

            curr = curr.next;
        }

        // If length is exactly n, the nth-to-last node would be null
        if (curr == null) {
            return null;
        }

        while (curr.next != null) {

            curr = curr.next;
            follower = follower.next;
        }

        return follower;
    }

    public void printLinkedList(Node head) {

        if (head == null) {

            return;
        }

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println(current);
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node first = new Node(5);
        Node second = new Node(6);
        Node third = new Node(7);

        head.next = first;
        first.next = second;
        second.next = third;
        third.next = null;

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.printLinkedList(head);

        Node h = singlyLinkedList.nthToLast(head, 3);
        System.out.println(h.data);

    }
}
public static class Queue {
    private static class Node {
        private int data;
        private Node next;
        private Node (int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        if (this.isEmpty()) {
            return -99999999;
        }
        return head.data;
    }

    public void add(int data) {
        // Add to the tail
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }

        tail = node;

        if (this.isEmpty()) {
            head = node;
        }
    }

    public int remove() {
        // Remove the head
        int data = head.data;
        head = head.next; // Assign the second node as the head
        if (head == null) {
            tail = null;
        }
        return data;
    }
}

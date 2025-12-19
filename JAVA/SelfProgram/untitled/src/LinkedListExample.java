class LinkedListExample {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List
    static class LinkedList {
        Node head;

        // Add node at end
        void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            // Traverse till last node
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        // Print Linked List
        void printList() {
            Node current = head;

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("NULL");
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List:");
        list.printList();
    }
}

class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head, tail;

    // Add node at end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Print list forward
    public void printForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Print list backward
    public void printBackward() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    // Remove node by value
    public void remove(int data) {
        Node curr = head;
    while (curr != null) {
            if (curr.data == data) {
                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
                else tail = curr.prev;
                break;
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.printForward();   // Output: 1 2 3
        dll.printBackward();  // Output: 3 2 1
        dll.remove(2);
        dll.printForward();   // Output: 1 3
    }
} 




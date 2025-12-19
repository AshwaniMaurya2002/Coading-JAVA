
public class LinkedList1 {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class LL {

        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;

            } else {
                tail.next = temp;
                tail = temp;
            }

        }

        void display() {
            Node curr = head;
            while (curr != null) {
                if (curr.next == null) {
                    System.out.print(curr.data + " --> null");
                    break;
                }
                System.out.print(curr.data + " -->");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {

        LL list = new LL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
    }
}

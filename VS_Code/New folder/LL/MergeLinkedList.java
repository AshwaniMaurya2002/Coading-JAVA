
public class MergeLinkedList {
    //Merge Two Sorted Lists

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

        static Node mergeTwoSortedLists(Node l1, Node l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;

            if (l1.data < l2.data) {
                l1.next = mergeTwoSortedLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoSortedLists(l1, l2.next);
                return l2;
            }
    }
}

public static void main(String[] args) {

        LL list1 = new LL();
        list1.insertAtEnd(10);
        list1.insertAtEnd(30);
        list1.insertAtEnd(50);

        LL list2 = new LL();
        list2.insertAtEnd(20);
        list2.insertAtEnd(40);
        list2.insertAtEnd(60);

        Node mergedHead = LL.mergeTwoSortedLists(list1.head, list2.head);

        LL mergedList = new LL();
        mergedList.head = mergedHead;
        mergedList.display();
    }
}

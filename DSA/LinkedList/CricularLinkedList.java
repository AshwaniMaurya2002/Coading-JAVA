public class CricularLinkedList {


    Node head;
    

    class Node{

        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        
    }

    public void add(int val){
        Node newNode=new Node(val, head);
        if(head==null)
            head=newNode;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=newNode;

        }

    
    }

    public void printLinkedList(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val);
                temp=temp.next;
            }
        }
    }




    public static void main(String[] args) {

        CricularLinkedList cl=new CricularLinkedList();
        
        cl.add(12);
        cl.add(123);
        cl.add(432);
        cl.add(12432);
        

        cl.printLinkedList();
        
    }
    
}

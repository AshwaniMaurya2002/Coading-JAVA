public class SinglyLinkedList {
    Node head;
    int size=0;
   private  class Node {
        private  int val;
        private  Node next;

         Node(int val) {
            this.val=val;
            Node next=null;
        }

    }   
    public void add(int val ){
        Node newNode=new Node(val);
        size++;
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
    public void printlist(){
        Node temp=head;
            if (temp == null) {
        System.out.println("List is empty");
    }
        else  while(temp != null){
            System.out.print(temp.val+"  ");
              temp=temp.next;
        }

    }

    public void addAtFirst(int val){
        Node newNode=new Node(val);
        if(head==null)
            head=newNode;
        else 
        {
           newNode.next= head;
           head=newNode;
        }
    }

    public void addAtSpecific(int point,int val){
        Node newNode=new Node(val);
        Node temp=head;
        if(point<0&&point>=size){
            System.out.println("Not a valid point");
        }
        else{
            for(int i=0;i<point;i++){

                temp.next=newNode;
            }
        }
    }

}

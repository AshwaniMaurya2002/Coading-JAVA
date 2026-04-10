public class Stack {


    Node top;

    private class Node{
        int val;
        Node next;

         Node(int val) {
            this.val = val;
            Node next=null;
        }
        
    }

    public void add(int val){
        Node newNode=new Node(val);
        if(top==null){
            top=newNode;
        }
        else{
            Node temp=top;
            while(temp.next!=null){
                
            }
        }
    }
}

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

    public void push(int val){
        Node newNode=new Node(val);
        if(top==null){
            top=newNode;
        }
        else{
           newNode.next=top;
           top=newNode;
        }
    }

    public int pop(){
        if(top==null){
            throw new java.util.EmptyStackException();
        }
        int ans = top.val;
        top = top.next;
        return ans;
    }

    public int peek(){
        if(top==null)
            return -1;
        else{
            return top.val;
        }
    }

    public boolean  isEmpty(){
        if(top==null)
                return true;
        else
            return false;
    }



    public void printList(){
        if(top==null)
            System.out.println("Empty");
        else{
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.val);
                temp=temp.next;
            }
        }
    }
}

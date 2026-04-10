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
        int ans;
        if(top==null){
            return -1;
        }
        else{
             ans=top.val;
            top=top.next;
        }
        return ans;
    }

    public int peek(){
        if(top==null)
            return -1;
        else{
            return top.val;
        }
    }

    


}

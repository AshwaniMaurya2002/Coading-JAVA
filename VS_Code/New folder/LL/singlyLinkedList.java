package LL;

public class singlyLinkedList {
    static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {

        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


       /* System.out.println(a.next.next.data);
        System.out.println(b.data);*/

      /*  while (a.next!=null){
            System.out.println(a.next.data);
            a.next=a.next.next;
        }*/

        Node x=new Node(3);
        x.next=c;
        b.next=x;


        while (a.next!=null){
            System.out.print("-->" + a.next.data);
            a.next=a.next.next;
        }







    }
}

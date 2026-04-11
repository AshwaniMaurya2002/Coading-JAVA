public class StackDriver {
    
    public static void main(String[] args) {
        
        Stack st=new Stack();
        st.push(12);
        st.push(11);
         st.push(12);
        st.push(11);
        // System.out.println(st.peek());
        // st.printList();
        System.out.println(st.pop());
        st.printList();
    }
}

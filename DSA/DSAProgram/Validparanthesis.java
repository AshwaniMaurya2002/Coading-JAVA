
import java.util.Stack;

public class Validparanthesis {

     static  Stack<Character> s=new Stack<>();

    public static  boolean  valid(String str){ 

        for (int i = 0; i <str.length(); i++) {

            char c=str.charAt(i);

           if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } 
            else{
                if(s.isEmpty()) {
                    return false;

                }

                char top=s.pop();

                if(c=='['&&top!=']'||c=='('&&top!=')'||c=='{'&&top!='}'){
                    return false;
                }
                    
            }
        }
        return s.isEmpty();
    }



    public static void main(String[] args) {
        
        System.out.println(valid("{{(}"));

    }
    
}

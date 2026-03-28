public class Browser {

    private static Browser b=null;

    public Browser() {
    }

    public static Browser getInstance(){
        if(b==null)
            b=new Browser();
        return b;
    }

    public void search(){
        System.out.println("searching the item");
        
    }
    
}

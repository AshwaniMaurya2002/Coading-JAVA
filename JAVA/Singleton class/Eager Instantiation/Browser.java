public class Browser {
// ! eager because object made brfore the method called

    private static Browser b=new Browser();

    public Browser() {
    }

    public static Browser getInstance(){
        return b;
    }

    public void search(){
        System.out.println("searching the item");
        
    }
    
}

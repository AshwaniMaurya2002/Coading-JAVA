
public class BrowserDriver {

    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.name = "Chrome";
        browser.version = "89.0";
        browser.size = 150.5;

        //calling state or attributes
        System.out.println("Browser Name: " + browser.name);
        System.out.println("Browser Version: " + browser.version);
        System.out.println("Browser Size: " + browser.size + " MB");

        System.out.println("\n+---------------------------+\n");
        //calling behavior or methods
        browser.open();
        browser.search();
        browser.goback();
        browser.refresh();
        browser.bookmark();
        browser.download();
        browser.close();

    }
}

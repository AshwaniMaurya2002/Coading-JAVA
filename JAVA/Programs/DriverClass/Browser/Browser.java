
class Browser {

    //State (Attributes)
    String name;
    String version;
    double size;

    //Behavior (Methods)
    void open() {
        System.out.println(name + " is opening.");
    }

    void search() {
        System.out.println(name + " is searching.");
    }

    void goback() {
        System.out.println(name + " is going back.");
    }

    void refresh() {
        System.out.println(name + " is refreshing.");
    }

    void bookmark() {
        System.out.println(name + " is bookmarking a page.");
    }

    void download() {
        System.out.println(name + " is downloading a file.");
    }

    void close() {
        System.out.println(name + " is closing.");
    }

}

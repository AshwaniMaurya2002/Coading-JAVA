
class app {

    app() {
        System.out.println("hello bro");

    }
    public void recursive(int a) {

        System.out.println("i am from function");

    }

    public static void main(String[] args) {

        app a = new app();
        a.recursive(0);

    }
}

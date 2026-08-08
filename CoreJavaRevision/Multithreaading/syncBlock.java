
public class syncBlock {

    int count = 0;

    public void increment() {
        synchronized (this) {
            count++;

        }
    }
}

package callback;

public class Asynchronous {

    public void printAsynchronous(Callback callback) throws InterruptedException {
        System.out.println("First print");

        new Thread(callback::printer).start();

        System.out.println("Last print");

    }

}

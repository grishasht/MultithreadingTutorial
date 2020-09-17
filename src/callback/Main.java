package callback;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        new Synchronous().printSynchronous(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Print sync");
            }
        });
        System.out.println();
        new Asynchronous().printAsynchronous(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Print async");
            }
        });

    }

}

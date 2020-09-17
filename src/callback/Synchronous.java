package callback;

public class Synchronous {

    public void printSynchronous(Callback callback){
        System.out.println("First print");

        callback.printer();

        System.out.println("Last print");
    }

}
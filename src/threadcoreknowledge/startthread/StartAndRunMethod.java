package threadcoreknowledge.startthread;

public class StartAndRunMethod {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        //main
        runnable.run();

        //Thread-0
        new Thread(runnable).start();
    }

}

package threadcoreknowledge.createthreads;

public class RunnableStyle implements Runnable {

    @Override
    public void run() {
        System.out.printf("Runnable style thread.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }
}

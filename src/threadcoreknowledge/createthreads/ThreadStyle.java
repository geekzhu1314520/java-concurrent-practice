package threadcoreknowledge.createthreads;

public class ThreadStyle extends Thread {

    @Override
    public void run() {
        System.out.println("Thread style.");
    }

    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}

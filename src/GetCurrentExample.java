public class GetCurrentExample {
    public static void main (String [] args){
        Runnable runnable = ()-> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" running");
        };

        Thread thread = new Thread(runnable,"The Thead 1");
        thread.start();

        Thread thread2 = new Thread(runnable,"The Thead 2");
        thread2.start();
    }
}

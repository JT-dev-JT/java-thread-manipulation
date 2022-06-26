public class PauseExample {
    public static void main(String [] args){
        Runnable runnable =()->{
          String threadName = Thread.currentThread().getName();
          System.out.println( threadName+" is running");

          try{
              Thread.sleep(2000);

          }catch (InterruptedException ex){
              ex.printStackTrace();
          }
          System.out.println(threadName+ " finished");

        };

        Thread thread1 = new Thread(runnable, "The thread");
        thread1.start();
    }

}

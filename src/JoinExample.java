public class JoinExample {
    public static void main (String [] args){
        Runnable runnable = ()->{
          for(int i =0 ; i< 5;i++){
              sleep(1000);
              System.out.println("Running");
          }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        //join the thread
        try{
            thread.join();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }
    public static void sleep (long millis){
        try{
            Thread.sleep(millis);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

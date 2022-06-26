
public class JVMExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                sleep(1000);
                System.out.println("Running");
            }
        };

        Thread thread = new Thread(runnable, "The Thread");
        //stop with main thread
        thread.setDaemon(true);
        thread.start();
        sleep(3000);

    }

    public static void sleep (long milis){
        try{
            Thread.sleep(milis);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }



}

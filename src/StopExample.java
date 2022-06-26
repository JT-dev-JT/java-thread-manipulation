public class StopExample {
    public static class StoppableRunnable implements Runnable{
        private boolean stopRequested = false ;
        public  synchronized void requestStop(){
            this.stopRequested = true;

        }
        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }
        private void sleep(long millis){
            try{
                Thread.sleep(millis);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }

        @Override
        public void run(){
            System.out.println("StoppableRunnable Running");
            while (!isStopRequested()){
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("StoppableRunnable Stop");
        }
    }

    public static  void main (String [] args){
        StoppableRunnable stoppableRunnable= new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable,"The Thread");
        thread.start();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("request stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");

    }

}

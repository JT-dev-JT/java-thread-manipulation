public class Example2 {
    public static class MyRunnable implements Runnable{
        @Override
        public void run (){
            System.out.println("My Runnable is running");
            System.out.println("My Runnable is finish");


        }
    }

    public static  void main (String [] args){
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

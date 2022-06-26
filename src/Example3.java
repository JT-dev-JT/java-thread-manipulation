public class Example3 {
    public static void main(String [] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable is running");
                System.out.println("Runnable is finish");

            }
        };

        Thread thread= new Thread(runnable);
        thread.start();

    }
}

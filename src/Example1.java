public class Example1 {
    public static class  MyThread extends Thread{
        public void run (){
            System.out.println("My thread running");
            System.out.println("My thread running");
        }

        public static void main(String[] args){
            MyThread myThread = new MyThread();
            myThread.start();

        }
    }

}

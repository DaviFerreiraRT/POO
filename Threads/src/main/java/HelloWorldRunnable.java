public class HelloWorldRunnable implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Hello World Threads!");


        }
    }

    public static void main(String[] args) throws InterruptedException {

                HelloWorldRunnable r = new HelloWorldRunnable();
                Thread t = new Thread(r);
                t.start();
                while (true) {
                    System.out.println("Dentro da Thread main");
                    
                }
             
        }
        

    }


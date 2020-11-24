public class NumerosPares implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 1) {
                System.out.println("Este Numero é impar:" + i);
            }
        }
    }

    public static void main(String[] args) {
        NumerosPares np = new NumerosPares();
        Thread th = new Thread(np);
        th.start();
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("Este Numero é par:" + i);
            }
        }
    }
}

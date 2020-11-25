public class NumerosPares implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 1000; i++) {
                if (i % 2 == 0) {
                    System.out.println("Este Numero é par:" + i);
                }
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Erro no sleep");

        }

    }

    public static void main(String[] args) {
        NumerosPares np = new NumerosPares();
        Thread th = new Thread(np);
        th.start();
        while (th.isAlive()) {

        }
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 1) {
                System.out.println("Este Numero é impar:" + i);
            }
        }
    }
}

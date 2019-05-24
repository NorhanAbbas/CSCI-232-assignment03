//public class Part_1 implements Runnable {
class ThreadOne extends Thread {
    public void run() {
        int i = 0;

        while (true) {
            try {
                Thread.sleep(1000);
                i++;
                System.out.println(i);

            } catch (InterruptedException e) {
                return;
            }
        }

    }
}

    class ThreadTwo extends Thread {
        public void run() {
            int i = 0;


            while (true) {
                try {
                    Thread.sleep(3000);
                    i++;
                    System.out.println("   "+i);
                } catch (InterruptedException e) {
                    return;
                }

            }
        }

    }


    public class Part_1 {

        public static void main(String[] args) {
            Thread t1 = new ThreadOne();
            t1.start();

            Thread t2 = new ThreadTwo();
            t2.start();

        }
    }



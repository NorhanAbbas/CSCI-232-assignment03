import java.lang.Thread;
import java.util.Random;

class ThreadOne_insert extends Thread {
    Random rand = new Random();
    public void run() {
        System.out.println("thread 1 inserted "+rand.nextInt(100));
    }
}
class ThreadTwo_insert extends Thread {

    Random rand = new Random();
    public void run() {
        System.out.println("thread 2 inserted "+rand.nextInt(100));
    }
}

class ThreadThree_insert  extends Thread {

    Random rand = new Random();
    public void run() {
        System.out.println("thread 3 inserted "+rand.nextInt(100));
    }
}

class ThreadFour_insert  extends Thread {

    Random rand = new Random();
    public void run() {
        System.out.println("thread 4 inserted "+rand.nextInt(100));
    }
}



public class Part_2 {

    public static void main(String[] args) {

        //Thread[] array = new Thread[100];

        Thread t1 = new ThreadOne_insert();
        Thread t2 = new ThreadTwo_insert();
        Thread t3 = new ThreadThree_insert();
        Thread t4 = new ThreadFour_insert();

        Thread[] array = new Thread[100];
// Create and start threads in the first loop
        for (int i = 0; i < 25; i++) {
            //t[i] = t1;
            array[i] = new Thread(t1);
            array[i].start();
            //t[i+1] = new Thread(new ThreadTwo_insert());
            //t[i+1].start();
            //t[i] = t2;
            //t[i].start();
            array[i] = new Thread(t2);
            array[i].start();

            array[i] = new Thread(t3);
            array[i].start();

            array[i] = new Thread(t4);
            array[i].start();

            try {
                array[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // System.out.println(array.length);
        }


    }
}

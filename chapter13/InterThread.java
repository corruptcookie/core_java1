// Interthread communication
// Using wait() and notify() to make two threads wait for each other

class A {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();     // Will wait for notify()
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Put : " + num);
        this.num = num;
        valueSet = true;
        notify();   // Will notify get
    }

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();     // Will wait for notify()
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Get : " + num);
        valueSet = false;
        notify();   // Will notify put
    }
}

class Producer implements Runnable {
    A a;

    public Producer(A a) {
        this.a = a;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            a.put(i++);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    A a;

    public Consumer(A a) {
        this.a = a;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            a.get();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        A a = new A();
        new Producer(a);
        new Consumer(a);
    }
}

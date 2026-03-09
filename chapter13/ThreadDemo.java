/*
    Multithreading
        Thread -> unit of a process
        Can be achieved by (extends Thread) or (implements Runnable)
        Runnable interface is functional interface so can use lambda expression
        Thread.start() -> Creates thread and calls run method
        Thread.run() -> Does not create new thread and calls only run method
        Thread.join() -> Makes current thread wait until thread is complete
        Thread.isAlive() -> Boolean check to see if thread is alive or not
 */

//class Hi implements Runnable {
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hi");
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//    }
//
//}
//
//class Hello implements Runnable {
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//    }
//
//}

class ThreadDemo {

    public static void main(String[] args) {
//        Runnable obj1 = () -> {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hi");
//
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//
//                }
//            };
//
//        Runnable obj2 = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Hello");
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//        };

        // Need to create thread for Runnable
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                // Thread.currentThread().getPriority();  (get priority within thread)
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        // How to print and set thread name
        // Can also do new Thread(Runnable obj, String name)
//        t1.setName("Hi Thread");
//        t2.setName("Hello Thread");
//        System.out.println(t1.getName());   // default name is Thread-0
//        System.out.println(t2.getName());   // default name is Thread-1

        // How to set and get priority
        // Range for priority is 1-10. 1 is least, 5 is normal, 10 is highest.
        // Can also use constants Thread.MIN_PRIORITY (1) & Thread.MAX_PRIORITY (10)
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());   // By default has priority 5
        System.out.println(t2.getPriority());

        // No start method in Runnable
//        obj1.start();
        t1.start();

        // Without this delay the scheduler will encounter both objects at once
        // causing it choose at random which obj can print
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // No start method in Runnable
//        obj2.start();
        t2.start();

        try {
            t1.join();  // Will make main thread wait for t1 and t2 to finish
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Bye");

    }

}

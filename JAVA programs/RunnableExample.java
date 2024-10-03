class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        
        thread1.start();
        thread2.start();
    }
}



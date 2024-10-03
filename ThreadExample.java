class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        A t1= new A();
        B t2 = new B();

        
        t1.start();  // Use start() to run the thread
        t2.start();  // Use start() to run the thread
        
        if(t1.isAlive()){
            System.out.println("still executed");
        }
        try{
             t1.join();
             t2.join();
        }
        catch(Exception e){

        }
        t1.setPriority(Thread.MAX_PRIORITY);
       
        
        System.out.println("Completed");
    }
}




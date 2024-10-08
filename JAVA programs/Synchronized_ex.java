class Table{
   synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
public class Synchronized_ex {
    public static void main(String[] args){
        Table t=new Table();
        Thread t1=new Thread(){
            public void run(){
                t.printTable(5);
            }
        };
    
        Thread t2=new Thread(){
            public void run(){
                t.printTable(10);
            }
        };

        t1.start();
        t2.start();
    }
    
}

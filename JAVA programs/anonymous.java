class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}
public class anonymous {
    public static void main(String[] args){
       A obj=new A()
       {
           public void show()
           {
              System.out.println("in NEW show");
           }
        };
        obj.show();
        
    }
}

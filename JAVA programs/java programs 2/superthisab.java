import java.util.Scanner;
abstract class abcls{
    abstract void display();
}

class Parent {
    protected String name;
    public Parent(String name)
    {
        this.name = name;
    }
}

class Child extends Parent {
    public Child(String name) 
    {
        super(name);
    }
    public void display() 
    {

        System.out.println("Name: " + name);
    }
}
public class superthisab {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the name:");
        String name=scan.nextLine();
        Child ch = new Child(name);
        ch.display();
    
    }
}
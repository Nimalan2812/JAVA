import java.util.Scanner;
abstract class vehicle
{
    String Vmake;
    String Vmodel;
    public vehicle(String make,String model)
    {
        this.Vmake=make;
        this.Vmodel=model;
    }
    public String getmake()
    {
        return Vmake;
    }
    public String getmodel()
    {
        return Vmodel;
    }
}

abstract class fourwheeler extends vehicle
{
    int no_of_doors;
    public fourwheeler(String make,String model,int no_of_doors)
    {
        super(make,model);
        this.no_of_doors=no_of_doors;
    }
    public  int  getnoofdoors()
    {
        return no_of_doors;
    }
}
    
abstract class twoWheeler extends vehicle
{
    Boolean hascarrier;
    public twoWheeler(String make,String model,Boolean hascarrier)
    {
        super(make,model);
        this.hascarrier=hascarrier;
    }
    public  Boolean gethascarrier()
    {
        return hascarrier;
    }
}

class car extends fourwheeler
{
    public car(String make,String model,int no_of_doors)
    {
        super(make,model,no_of_doors);
    }
    public void display()
    {
        System.out.println("Car make:"+getmake());
        System.out.println("car model:"+getmodel());
        System.out.println("no of door:"+getnoofdoors());

    }
}
class bike extends twoWheeler
{
    public bike(String make,String model,Boolean hascarrier)
    {
        super(make,model,hascarrier);
    }
    public void display()
    {
        System.out.println("bike make:"+getmake());
        System.out.println("bike model:"+getmodel());
        System.out.println("hascarrier:"+gethascarrier());

    }
}

public class hybrid_inheritence{
    public static void main(String[] args){
         Scanner scan=new Scanner(System.in);
         System.out.print("enter car make:");
         String carmake=scan.nextLine();
         System.out.print("enter car model:");
         String carmodel=scan.nextLine();
         System.out.print("enter no of doors:");
         int no_of_doors=scan.nextInt();
         scan.nextLine();
        System.out.print("enter bike make:");
        String  bikemake=scan.nextLine();
        System.out.print("enter bike model:");
        String bikemodel=scan.nextLine();
        System.out.print("enter hascarrier:");
        Boolean hascarrier=scan.nextBoolean();
        car obj1=new car(carmake,carmodel,no_of_doors);
        bike obj2=new bike(bikemake,bikemodel,hascarrier);
        obj1.display();
        obj2.display();

   

    }
}
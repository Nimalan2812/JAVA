import java.util.Scanner;
class vehicle{
    String vmake;
    String vmodel;
}
class car extends vehicle{
    int no_doors;
    public void setcarmake(String make)
    {
        this.vmake=make;
    }
    public void setcarmodel(String model)
    {
        this.vmodel=model;
    }
    public void setdoors(int n)
    {
        this.no_doors=n;
    }

}
class bike extends vehicle
{
    String biketype;
    public void setbike(String bikemake)
    {
        this.vmake=bikemake;
    }
    public void setmodel(String bikemodel)
    {
        this.vmodel=bikemodel;
    }
    public void settype(String type)
    {
        this.biketype=type;
    }
}


public class hierarchial {
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    car ob1=new car();
    bike ob2=new bike();
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
    System.out.print("enter bike type:");
    String biketype=scan.nextLine();
   
    ob1.setcarmake(carmake);
    ob1.setcarmodel(carmodel);
    ob1.setdoors(no_of_doors);
    ob2.setbike(bikemake);
    ob2.setmodel(bikemodel);
    ob2.settype(biketype);

    System.out.println(("Car make:"+ob1.vmake));
    System.out.println(("Car model:"+ob1.vmodel));
    System.out.println(("no of doors:"+ob1.no_doors));

    System.out.println(("bike make:"+ob2.vmake));
    System.out.println(("bike model:"+ob2.vmodel));
    System.out.println(("bike type:"+ob2.biketype));
}
}


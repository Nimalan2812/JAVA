import java.util.Scanner;
class Person{
	String Name;
    int age;
    public Person(String Name,int age){
    	this.Name=Name;
    	this.age=age;
    }
}
class Employee extends Person{
    String Employee_id;
    String Department;
	public Employee(String Name, int age,String Employee_id,String Department)
	{
		super(Name,age);
		this.Employee_id=Employee_id;
		this.Department=Department;
	}
	public void Display() {
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee Age:"+age);
		System.out.println("Employee Id:"+Employee_id);
		System.out.println("Employee Department:"+Department);
		
	}
}

public class singleinheritence {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String Name=scan.nextLine();
		int age=scan.nextInt();
		scan.nextLine();
		String Employee_id=scan.nextLine();
		
		String Department=scan.nextLine();		
		Employee Obj=new Employee(Name,age,Employee_id,Department);
		
		Obj.Display();
		
	}

}

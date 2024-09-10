import java.util.Scanner;
public class Bmi {
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		double weight=obj.nextDouble();
		double height=obj.nextDouble();
		double BMI=weight/(height*height);
		System.out.println(BMI);
		if(BMI < 18.5)
			System.out.print("Underweight");
		else if(BMI>=18.5 && BMI<24.9)
			System.out.print("Normal Weight");
		else if(BMI>=25 && BMI<29.9)
			System.out.print("Overweight");
		else
			System.out.print("Obesity");
		
	}
}
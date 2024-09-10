import java.util.Scanner;
class Voter{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=scan.nextInt();
        if(age>=18)
        {
            System.out.print("|"+age+"|"+"|Eligible for vote|");
        }
        else
        {
            System.out.print("|"+age+"|"+"|Not Eligible for vote|");
        }

    }
}
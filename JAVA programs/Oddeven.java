import java.util.Scanner;
class Oddeven{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=scan.nextInt();
        if(n%2==0)
        {
            System.out.print(n+"  is even");
        }
        else
        {
            System.out.print(n+"  is Odd");
        }
    }
}
import java.util.Scanner;
class Grade{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the mark:");
        int mark=scan.nextInt();
        if(mark <= 90 && mark>75)
            System.out.print("Grade A");
        else if(mark <= 75 && mark>56)
             System.out.print("Grade B");
        else if(mark <=55 && mark>41)
             System.out.print("Grade C");
        else if(mark <= 40)
            System.out.print("Fail");
        else
            System.out.print("un defined");
    }
}
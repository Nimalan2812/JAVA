import java.util.Scanner;
class Grade{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the mark:");
        int mark=scan.nextInt();
        if(mark>=90)
            System.out.print("Grade A");
        else if(mark>=80 && mark<90)
             System.out.print("Grade B");
        else if(mark>=70 && mark<80)
             System.out.print("Grade C");
        else if(mark>=60 && mark<70)
            System.out.print("Grade D");
        else if(mark<60)
            System.out.print("fail");
        else
            System.out.print("un defined");
    }
}
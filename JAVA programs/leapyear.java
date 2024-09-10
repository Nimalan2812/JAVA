import java.util.Scanner;
class leapyear{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();
        if(year%4==0 && (year%400==0 || year%100!=0)){
            System.out.print(year+"is a leap year");
        }
        else{
            System.out.print(year+"is not a leap year");
        }
    }
}
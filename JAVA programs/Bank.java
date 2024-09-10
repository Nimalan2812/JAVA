import java.util.Scanner;
class Bank{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("your current balance:");
        float current_balance=scan.nextFloat();
        System.out.print("enter how much amount you withdraw:");
        float withdraw=scan.nextFloat();
        float newbalance=current_balance-withdraw;
        if(withdraw>current_balance)
            System.out.print("error:insufficient balance");
        else
            System.out.println("Withdraw Successfull!");
            System.out.print("newBalance amount:"+newbalance);
    }
}
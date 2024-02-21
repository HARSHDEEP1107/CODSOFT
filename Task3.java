import java.util.Scanner;
class ATM{
    double balance=12000;
    int PIN=7861;
    double amount;
    Scanner s=new Scanner(System.in);
    public void checkPin(){
        System.out.print("Enter the 4 digit PIN:");
        
        int pin=s.nextInt();
        if(pin==PIN){
            menu();
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    public void menu(){
        System.out.println("    ATM");
        System.out.println("Enter Your Choice");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");
        int opt=s.nextInt();
        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdraw();
        }
        else if(opt==3){
            deposit();
        }
        else if(opt==4){
            System.out.println("Thank You! Visit Again");
            return;
        }
        else{
            System.out.println("Enter a valid Input");
        }
    }
    public void checkBalance(){
        System.out.print("Current Balance:" +balance);
        menu();
    }
    public void withdraw(){
        System.out.print("Enter the Amount to be Withdraw:");
        amount=s.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=amount;
            System.out.println(amount+ "is Withdraw Successfully.Now Bank Balance:" +balance+ "\n");
        }
        menu();
    }
    public void deposit(){
        System.out.print("Enter the Amount:");
        amount=s.nextDouble();
        balance+=amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}
public class Task3 {
    public static void main(String[] args){
        ATM obj=new ATM();
        obj.checkPin();
    }
}

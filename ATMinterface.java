
import java.util.Scanner;

public class ATMinterface {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=5000;
        int choice;
        do { 
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    double withdraw=sc.nextDouble();
                    if(withdraw>0 && withdraw<=balance){
                        balance-=withdraw;
                        System.out.println("$ "+withdraw+" is successfully withdrawn");
                    }
                    else{
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double deposit=sc.nextDouble();
                    if(deposit>0){
                        balance+=deposit;
                        System.out.println("$ "+deposit+" is successfully deposited");
                    }
                    else{
                        System.out.println("Invalid transaction");
                    }
                    break;
                case 3:
                    System.out.println("Your balance is: "+balance);
                    break;
                case 4:
                    System.out.println("Thank you for choosing this ATM");
                    break;
                default:
                    System.out.println("Enter valid choic from 1 to 4");
                    break;
            }
        } while (choice!=4);
        sc.close();
    }
}
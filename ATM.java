import java.util.*;


public class ATM {
    public static void main(String args[]) {
        int balance = 100000, withdraw, deposit;

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("********************");
            System.out.println("**********AUTOMATED TELLER MACHINE**********");
            System.out.println(" CHOOSE 1 for Withdraw");
            System.out.println(" CHOOSE 2 for deposit");
            System.out.println(" CHOOSE 3 for Balance Enquiry ");
            System.out.println(" CHOOSE 4 for Exit");
             int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to be Witdrawn");
                   withdraw = sc.nextInt();
                   if(balance>=withdraw){
                       balance = balance-withdraw;
                   }else{
                       System.out.println("Insuficent Balance");
                   }
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited ");
                    deposit = sc.nextInt();
                    deposit = balance+deposit;
                    System.out.println("the amount "+ deposit+ " is deposited succesfully ");
            
                case 3:
                System.out.println("The total balance is "+ balance);


                case 4:
                System.exit(0);

                    
                default:
                System.out.println("invalid option");
                    break;
            }

        }
    }
}
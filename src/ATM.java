
/**
 *
 * @author simeonkakpovi
 */

import java.util.Scanner;
 
public class ATM {
 
    public static void main(String[] args){
 
        System.out.println("\n Welcome to the atm. Login to continue!");
        
        int logged_in = 0;
        Account acc1 = new Account("12345678", "kkneomis", 1234.33, 1234);
        Account acc2 = new Account("98765432", "spongebob", 1.00, 1234);
        Account acc4 = new Account("92345678", "patrick", 1234.33, 1234);
        
        while(logged_in == 0){
            logged_in = getAccount(acc1);
        }
        
        if(logged_in == 1){
            System.out.println("You have been logged in");
            System.out.println("You account balance is: $" + acc1.getBalance());
            //do something
        }
        
 
    }//end main
 
    public int login(Account user){
        Scanner sc = new Scanner(System.in);
 
        System.out.println("What is your account number?");
        String accountNumber = sc.nextLine();
        System.out.println("What is your pin number?");
        int pin = sc.nextInt();
 
        if((user.getAccountNumber().equals(accountNumber)) && (user.getPin() == pin)){
            return 1;
        }
        return 0;
        
     }
 
    public static int getAccount(Account user){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your account number?");
        String accountNumber = sc.nextLine();
        System.out.println("What is your pin?");
        int pin = sc.nextInt();
        
        if(user.getAccountNumber().equals(accountNumber)){
            System.out.println("Hello " + user.getUsername());
            if(user.getPin() == pin){
                return 1;
            } 
        } 
        
        System.out.println("You username or pin is incorrect...\n try again!");
        return 0;
   
    }
 
 }//end class
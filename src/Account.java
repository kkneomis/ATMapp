
/**
 *
 * @author simeonkakpovi
 */

public class Account {
    
     private String accountNumber;
     private String username;
     private double balance;
     private int pin;
 
     public Account(String a, String u, double b, int p){
         accountNumber = a;
         username = u;
         balance = b;
         pin = p;
     }
     
     public void deposit(double value){
         balance += value;
     }
 
     public void withdraw(double value){
         balance -= value;
     }
 
 
     public void setAccountNumber(String newNumber){
         accountNumber = newNumber;
     }
 
     public void setUsername(String newName){
         username = newName;
     }
 
     public void setBalance(double newBalance){
         balance = newBalance;
     }
 
     public void setPIn(int newPin){
         pin = newPin;
     }
 
     public String getAccountNumber (){
         return accountNumber;
     }
 
     public String getUsername (){
         return username;
     }
 
     public double getBalance(){
         return balance;
     }
 
     public int getPin (){
         return pin;
     }
    
}

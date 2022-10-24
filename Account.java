/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebankproject;

import java.util.Scanner;

/**
 *
 * @author EDA ÇELEBİ
 */
class Account {

     int balance;
   int minimum_balance;
   int account_number;
  int iban_number;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMinimum_balance(int minimum_balance) {
        this.minimum_balance = minimum_balance;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setIban_number(int iban_number) {
        this.iban_number = iban_number;
    }

    public int getBalance() {
        return balance;
    }

    public int getMinimum_balance() {
        return minimum_balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    public int getIban_number() {
        return iban_number;
    }

   
   
  
   
   
   public  void eft() {
   
    Scanner input = new Scanner(System.in);
    
       System.out.println("Enter the amount you want to send");
       
      
       
       int max_eft = balance-minimum_balance;
       int eft_amount = input.nextInt();
       
       if (eft_amount <= max_eft) {
           
           balance = balance - eft_amount;
           
           System.out.println("Your transaction has been carried out \nyour available balance:" + this.balance);
           
       }
       else {
           
           System.out.println("Insufficient balance");
       }
             
       
      
    
    
    
   }   

}

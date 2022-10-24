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
class CreditCard {

    int limit;
 int number;
  int total_debt;
     int minimum_debt;
    
    
   

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTotal_debt(int total_debt) {
        this.total_debt = total_debt;
    }

    public void setMinimum_debt(int minimum_debt) {
        this.minimum_debt = minimum_debt;
    }

    public int getLimit() {
        return limit;
    }

    public int getNumber() {
        return number;
    }

    public int getTotal_debt() {
        return total_debt;
    }

    public int getMinimum_debt() {
        return minimum_debt;
    }
    
    
     public void debt() {
         
       Account account_credit= new Account();
       
       account_credit.setBalance(5000);
       
       
       
     
                
         
         
         Scanner input=new Scanner(System.in);
         System.out.println("Your debt:" + total_debt);
         System.out.println("Enter the amount you want to pay \ncan't be less than"+ minimum_debt);
        
         int pay = input.nextInt();
         
         if (pay<minimum_debt) {
             
             System.out.println("Transaction failed");
             
         }
         else {
             
             account_credit.balance = account_credit.balance - pay;
             
            
             System.out.println("Your remaining debt:" + (total_debt-pay));
             
         }
        
        
    }

    
}

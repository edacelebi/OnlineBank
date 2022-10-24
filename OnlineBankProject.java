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
public class OnlineBankProject {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
         user user1 = new user(); 
          
         user1.setName("EDA");
         user1.setSurname("ÇELEBİ");
         user1.setPassword(525252);
         user1.setEmail_addres("celebiiedaa@gmail.com");
         user1.setCostumer_number(748728 );
        
        
         Scanner input = new Scanner(System.in);
         
         Account account8 = new Account();
        account8.setBalance(10000);
        account8.setMinimum_balance(1000);
        account8.setIban_number(123456789);
        account8.setAccount_number(59592234);
        
        
        CreditCard credit8= new CreditCard();
        credit8.setLimit(1000);
        credit8.setMinimum_debt(720);
        credit8.setTotal_debt(2400);
        credit8.setNumber(111317);
         
         
         for (int i=1;;i++) {
         
         System.out.println("Enter pasword;");
         int password=input.nextInt();
         
         if (password==user1.getPassword()) {
             break;
         } 
         else {
             System.out.println("Try again");
        
         
         }          
       
    }
    
         System.out.println("" + user1.name +" "+ user1.surname);
         
         System.out.println("Press 1 to create a new card or account, press 2 for your previous account and card transactions");
         int main_operation=input.nextInt();
         
         switch (main_operation) {
             case 1:
               
                 
                 
                 System.out.println("Press 1 to create an account or press 2 to create a credit card");
         
         int operation=input.nextInt();
          switch(operation) {
              case 1:
                   for (int i=1;i<=5;i++) {
             Account accounti = new Account();
             
             System.out.println("Enter minimum balance (İf press 0, it ends)");
             accounti.setMinimum_balance(input.nextInt());
                if (accounti.minimum_balance==0) {
                    break;
                }     
                 
                System.out.println("Enter balance");
                accounti.setBalance(input.nextInt());
                
              int a = (int)(Math.random()*9999999);
              
              accounti.setIban_number(a);
              
              int b = (int)(Math.random()*99999);
              
              accounti.setAccount_number(b);

                       System.out.println("your account number:"+accounti.account_number);
                       System.out.println("your iban number:"+accounti.iban_number);
                       System.out.println("your balance:"+accounti.balance);
                       System.out.println("your minimum balance:"+accounti.minimum_balance);
              
                
          }  break;
      
              case 2:
                  for (int j =1;j<=2;j++){
                      CreditCard crediti = new CreditCard();
                       System.out.println("Determine your limit");
                       crediti.setLimit(input.nextInt());
                        if (crediti.limit==0){
                           break;
                       }
                       System.out.println("Determine your minimum debt:");
                       crediti.setMinimum_debt(input.nextInt());
                       crediti.setTotal_debt(0);
                       
                       int k= (int)(Math.random()*9999999);
                       
                       crediti.setNumber(k);
 
                       System.out.println("your credit card number:"+crediti.number);
                       System.out.println("your credit card limit:"+crediti.limit);
                       System.out.println("your minimum debt:"+crediti.minimum_debt);
                       System.out.println("your debt:"+crediti.total_debt);
                       
                       
                       
                      
                      
                     
                  }
                   
                    
                    }
         break;
             
              case 2:
                   System.out.println("press 1 to make eft, press 2 to pay credit card debt");
         int operation2 = input.nextInt();
         
         switch (operation2) {
             
             case 1:
                 
             account8.eft();
             
             break;
                
             case 2:
                 
             credit8.debt();
             
             break;
         }
                  
        break;
                
         }
    }
    
}

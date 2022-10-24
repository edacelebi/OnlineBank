/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebankproject;

/**
 *
 * @author EDA ÇELEBİ
 */
class user {

       public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCostumer_number() {
        return costumer_number;
    }

    public String getEmail_addres() {
        return email_addres;
    }

    public int getPassword() {
        return password;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCostumer_number(int costumer_number) {
        this.costumer_number = costumer_number;
    }

    public void setEmail_addres(String email_addres) {
        this.email_addres = email_addres;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
      
    String name;
    String surname;
    int costumer_number;
    String email_addres;
    int password;
    int phone_number;

    
}

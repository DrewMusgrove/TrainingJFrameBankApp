/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bankaccount;

import javax.swing.JOptionPane;

/**
 *
 * @author drew.musgrove
 */
public class BankAccount {
private double balance; 
private int accountNumber;

    public BankAccount(double balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    
    public void withdraw(double withdrawAmount){
        if (withdrawAmount<0){
             JOptionPane.showMessageDialog(null, "You cant withdraw negative money");
        }
        else{
          if (withdrawAmount > this.balance){
                JOptionPane.showMessageDialog(null, "You cant withdraw more money than you have!");
            }
            else{
                this.balance = this.balance - withdrawAmount;
            }      
        }
           
    }
    
    public void deposit(double depositAmount){
        if (depositAmount<0){
             JOptionPane.showMessageDialog(null, "You cant deposit negative money");
        }
        else{
            this.balance = this.balance + depositAmount;
        }
        
    }
    
    public String getBalance(){
        return Double.toString(this.balance);
    }
    public String getAccountNumber(){
        return Integer.toString(this.accountNumber);
    }
    
}

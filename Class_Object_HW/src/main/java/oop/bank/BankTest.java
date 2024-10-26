/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bank;

/**
 *
 * @author ACER
 */
public class BankTest {
   public static void main(String[]args){
       
    IBank vcb = new VietComBank();
    vcb.createAccount("Nguyen Van A", "nva");
    vcb.deposit(1_000_000_000);
    
    IBank bidv = new BIDVBank();
    bidv.createAccount("Nguyen Can", "abc");
    
    vcb.withdraw(100_000_000);
    bidv.withdraw(100_00_000);
    
    
    vcb.display();
    bidv.display();
    
    MyThread t = new MyThread();
    
    Thread t1 = new Thread(){
        
    }
            
            
   
    IBank newBank = new IBank(){
        @Override
        public void createAccount(String name, String id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            
            System.out.println("Anonimous Bank Name");
        }

        @Override
        public void deposit(long amount) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void withdraw(long amount) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void display() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }   
    }
            
   }
}

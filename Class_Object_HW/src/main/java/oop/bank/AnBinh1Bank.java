/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bank;

/**
 *
 * @author ACER
 */
public class AnBinh1Bank implements IBank {
    private String name;
    private String id;
    private Long amount;
    
    public AnBinh1Bank(){
        
    }
    
    @Override
    public void display(){
        System.out.println("AnBinh Account" + name + "amount" + amount);
    }
    
    @Override
    public void createAccount(String name, String id){
        this.name = name;
        this.id = id;
        this.amount = 0L;
    }
    
    @Override
    public void deposit(long amount){
        this.amount += amount;
    }
    
    @Override
    public void withdraw(long amount){
        this.amount -= amount;
    }
    
}

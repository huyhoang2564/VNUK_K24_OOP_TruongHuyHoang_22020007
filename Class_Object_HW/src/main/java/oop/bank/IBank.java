/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oop.bank;

/**
 *
 * @author ACER
 */
public interface IBank {
    void createAccount(String name, String id);
    void deposit(long amount);
    void withdraw(long amount);
    void display();
}

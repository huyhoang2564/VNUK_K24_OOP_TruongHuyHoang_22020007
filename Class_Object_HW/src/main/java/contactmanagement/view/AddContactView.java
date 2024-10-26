/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement.view;

import contactmanagement.controller.ContactController;
import contactmanagement.exception.ContactExistException;
import contactmanagement.model.Contact;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class AddContactView implements IView{
    private Scanner scanner;
    
    public AddContactView(){
        scanner = new Scanner(System.in);
    }
    
    @Override
    public void show(){
       Contact contact = input();
       try{
           ContactController contactController = ContactController.getInstance();
           contactController.add(contact);
           System.out.println("Add successful!");
           
       }catch(ContactExistException ex){
           System.out.println(ex.getMessage());
       }
    }
    
    private Contact input(){
        String name, phoneNumber;
        System.out.println("Input contatc information");
        System.out.print("Name: ");
        name = scanner.nextLine();
        
        System.out.print("Phone number: ");
        phoneNumber = scanner.nextLine();

        return new Contact(name, phoneNumber);
    }
}

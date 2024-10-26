/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement.view;

import contactmanagement.model.Contact;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ContactView implements IView{
    private ArrayList<Contact> contacts;
    
    public ContactView(){
        
    }
    
    public void set(ArrayList<Contact> list){
        contacts = list;
    }
    
    @Override
    public void show(){
        System.out.println("-----Contact----");
        System.out.printf("%-20s %-15s", "Name", "Phone number");
        for (Contact c: contacts){
            System.out.printf("\n%-20s %-15s", c.getName(), c.getPhoneNumber());
        }
        
        System.out.println("\n -----Contact----");
    }
}

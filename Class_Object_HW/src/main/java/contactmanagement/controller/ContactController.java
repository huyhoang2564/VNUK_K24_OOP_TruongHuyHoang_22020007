/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement.controller;

import contactmanagement.exception.ContactExistException;
import contactmanagement.model.Contact;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ContactController {
    private static ContactController instance;
    private ArrayList<Contact> contacts;
    
    private ContactController(){
        contacts = new ArrayList();
        
        contacts.add(new Contact("Anna", "0954862584"));
        contacts.add(new Contact("Bud", "0954868984"));
        contacts.add(new Contact("Anna", "0954862584"));
        
    }
    
        public static ContactController getInstance() {
        if (instance == null) {
            instance = new ContactController();
        }
        return instance;
    }

    public ArrayList<Contact>get(){
        return contacts;
    }
    
    public void add(Contact contact) throws ContactExistException{
        if(isExist(contact)){
            throw new ContactExistException(contact.getPhoneNumber() + "is exist");
        }
        contacts.add(contact);
    }
    
    private boolean isExist(Contact contact){
        for (Contact c : contacts){
            if(c.getPhoneNumber().equals(contact.getPhoneNumber())){
                return true;
            }
        }
        return false;
    }

    
}

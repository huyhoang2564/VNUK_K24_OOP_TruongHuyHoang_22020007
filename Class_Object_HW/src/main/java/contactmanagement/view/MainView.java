/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement.view;

import contactmanagement.controller.ContactController;
import contactmanagement.exception.IntFormatException;
import contactmanagement.model.Contact;
import contactmanagement.utils.Utils;
import java.util.ArrayList;


/**
 *
 * @author ASUS
 */
public class MainView {
    private final int MENU_EXIT = 0;
    private final int MENU_VIEW_CONTACTS = 1;
    private final int MENU_ADD_CONTACTS = 2;
    private final int MENU_EDIT_CONTACTS = 3;
    private final int MENU_DELETE_CONTACTS = 4;
    private final int MENU_SEARCH_CONTACTS = 5;
    
    private ContactController contactController = ContactController.getInstance();
    private ContactView contactView;
    private AddContactView addContactView;
    
    public MainView(){
        contactView = new ContactView();
        addContactView = new AddContactView();
    }
            
    
    public void run(){
        int choosen;
        do{
            menu();
            choosen = inputFeature();
            process(choosen);
        }while(choosen != MENU_EXIT);
    }
    private void menu(){
        System.out.println("------------Contact Management");
        System.out.println("\n\t\t 1. ViewContacts");
        System.out.println("\n\t\t 2. Add");
        System.out.println("\n\t\t 3. Edit");
        System.out.println("\n\t\t 4. Delete");
        System.out.println("\n\t\t 5. VSearch");
        System.out.println("\n\t\t 6. ViewContacts");
        System.out.println("\n\t\t Choose: ");
    }
    
    
    
    private void process(int feature){
        switch (feature){
            case MENU_EXIT:
                System.out.println("BYE BYE!");
                break;
            case MENU_VIEW_CONTACTS:
                ArrayList<Contact> contacts = ContactController.getInstance().get();
                contactView.set(contacts);
                contactView.show();
                System.out.println("MENU_VIEW_CONTACTS");
                break;
            case MENU_ADD_CONTACTS:
                addContactView.show();
                System.out.println("MENU_ADD_CONTACTS");
                break;
            case MENU_EDIT_CONTACTS:
                System.out.println("MENU_EDIT_CONTACTS");
                break;
            case MENU_DELETE_CONTACTS:
                System.out.println("MENU_DELETE_CONTACTS");
                break;
            case MENU_SEARCH_CONTACTS:
                System.out.println("MENU_SEARCH_CONTACTS");
                break;
            default:
                System.out.println("Wrong feature");
        }
    }
    
    private int inputFeature(){
        while(true){
            try{
                return Utils.inputInt();
            }catch(IntFormatException ex){
                System.out.println(ex.getMessage());
                System.out.println("Input again");
            }
        }
    }
}

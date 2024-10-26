/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement.model;

/**
 *
 * @author ASUS
 */
public class Contact {
    private String name;
    private String phoneNumber;
    
public Contact(String name, String phoneNumber){
    this.name = name;
    this.phoneNumber = phoneNumber;
}

public String getName(){
   return name;
}

public void setName(String name){
    this.name = name;
}

public String getPhoneNumber(){
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber){
    this.phoneNumber= phoneNumber;
}
    
    @Override
    public String toString(){
       return String.format("%-20s %-15s", name, phoneNumber);
        
    }
}

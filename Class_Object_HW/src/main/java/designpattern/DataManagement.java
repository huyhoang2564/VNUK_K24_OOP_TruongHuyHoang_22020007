/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

/**
 *
 * @author ASUS
 */
public class DataManagement {
    private static DataManagement instance;
    
    private DataManagement(){}
    public static DataManagement getInstance(){
         if (instance == null){
             instance = new DataManagement();
         }   
         return instance;
    }
    
    public static void showMessage(){
        System.out.println("Hello");
    }
}

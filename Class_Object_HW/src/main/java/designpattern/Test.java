/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[]args){
        DataManagement dataManagement = DataManagement.getInstance();
        dataManagement.showMessage();
        
        DataManagement dataManagement1 = DataManagement.getInstance();
        dataManagement1.showMessage();
    }
}

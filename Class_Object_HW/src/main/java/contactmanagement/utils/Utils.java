/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanagement.utils;

import contactmanagement.exception.IntFormatException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Utils {
    public static int inputInt()throws IntFormatException{
        Scanner sc = new Scanner(System.in);
        String strNum = sc.nextLine();
        try{
            return Integer.parseInt(strNum);
        }catch(NumberFormatException exception){
            throw new IntFormatException();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MainTest {
    public void main(String[]args){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Student("Nguyen Van A", 20, 7.5f));
        list.add(new Student("Nguyen Van B", 20, 7.5f));
        list.add(new Student("Nguyen Van C", 20, 7.5f));
        
        list.add(new Teacher("Nguyen Thi A", 60, 40_000_000l));
        list.add(new Teacher("Nguyen Van A", 30, 10_000_000l));
        list.add(new Teacher("Nguyen Thi C", 50, 30_000_000l));
        
        for(Person p : list){
            System.out.println(p.toString());
        }
    }
}

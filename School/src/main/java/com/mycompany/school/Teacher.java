/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author ASUS
 */
public class Teacher extends Person {
    private long salary;
    
    public Teacher(String name, int age, long salary){
        super(name, age);
        this.salary = salary;
    }
    
    public long getSalary(){
        return salary;
    }
    
    public void setSalary(long salary){
        this.salary = salary;
    }
    
    @Override
    public void display(){
        //super.display();
        System.out.println(name + " - " + age + " - " + salary);
    }
}

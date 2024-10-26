/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ACER
 */
public class Student extends Person{
    private float score;
    
    public Student(String name, int age, float score){
        super(name, age);
        this.score = score;
    }
    
    @Override
    public void display(){
        //super.display();
        System.out.println(name + " - " + age + " - " + score);
    }
}

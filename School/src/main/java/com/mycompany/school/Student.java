/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author ASUS
 */
public class Student extends Person{
    private float score;
    
    public Student(String name, int age, float score){
        super(name, age);
        this.score = score;
    }
    
    public float getScore(){
        return score;
    }
    
    public void setScore(float score){
        this.score = score;
    }
    
    @Override
    public void display(){
        //super.display();
        System.out.println(name + " - " + age + " - " + score);
    }
}

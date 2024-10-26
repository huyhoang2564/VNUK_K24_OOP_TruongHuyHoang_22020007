/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class MainTest {
    public static void main(String[]args){
        Person p = new Person("Tran",22);
        p.display();
        
        Student s = new Student("Trang", 19, 7.0f);
        s.display();
        
        Dog d = new Dog();
        d.sayHello();
        
        Cat c = new Cat();
        c.sayHello();
        
        Animal a1 = new Cat();
        Animal a3 = new Dog();
        
        Person p1 = s;
        p1.display();
        
        Person person = new Student("John", 22, 10f);
        person.display();
        
        Student student = (Student)person; //Ep kieu du lieu
        student.display();
        
        ArrayList<Animal> animals = new ArrayList();
        animals.add(c);
        animals.add(d);
        
        for(Animal a : animals){
            a.run();
            a.sayHello();
        }
    }
}

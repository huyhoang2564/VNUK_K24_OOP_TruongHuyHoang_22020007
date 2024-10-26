/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.truonghuyhoang;

/**
 *
 * @author ASUS
 */
public class Employee {

    private int id;
    private String name;
    private String phone;
    private String address;
    private double salary;

    // Constructor
    public Employee(int id, String name, String phone, String address, double salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    // Getters and setters
    public int getId(){
        return id; 
    }
    
    public void setId(int id) { 
        this.id = id; 
    }

    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    public String getPhone() { 
        return phone; 
    }
    public void setPhone(String phone) { 
        this.phone = phone; 
    }

    public String getAddress() { 
        return address; 
    }
    public void setAddress(String address) { 
        this.address = address; 
    }

    public double getSalary() { 
        return salary; 
    }
    
    public void setSalary(double salary) { 
        this.salary = salary; 
    }
    
    @Override
    public String toString() {
        return String.format("%-5d %-20s %-15s %-30s %.2f", id, name, phone, address, salary);
    }
}
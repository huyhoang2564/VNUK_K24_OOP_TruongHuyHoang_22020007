/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author ASUS
 */
public class Employee {

    private int id;
    private String name;
    private String address;
    private String phone;
    private double salary;

    // Constructor
    public Employee(int id, String name, String address, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    // Getter and Setter methods
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // toString method for easy display
    @Override
    public String toString() {
        return String.format("%-5d %-20s %-15s %-30s %.2f", id, name, phone, address, salary);
    }
}

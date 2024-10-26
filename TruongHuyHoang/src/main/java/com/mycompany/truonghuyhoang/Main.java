/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.truonghuyhoang;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ASUS
 */


public class Main {
    private static final ArrayList<Employee> employees = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static int currentId = 1; // Start ID from 1

    private static void inputEmployee() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        double salary;
        while (true) {
            System.out.print("Enter Salary: ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                if (salary >= 0) {
                    break;
                } else {
                    System.out.println("Invalid salary! Please enter a non-negative salary.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); 
            }
        }
        scanner.nextLine(); 

        employees.add(new Employee(currentId++, name, phone, address, salary));
        System.out.println("Employee added successfully!");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nEMPLOYEE MANAGEMENT");
            System.out.println("1. Input employee");
            System.out.println("2. Display employee list");
            System.out.println("3. Show employee with highest salary");
            System.out.println("4. Display sorted employees by salary");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    inputEmployee();
                    break;
                case 2:
                    displayEmployeeList();
                    break;
                case 3:
                    showHighestSalaryEmployee();
                    break;
                case 4:
                    displaySortedEmployees();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    private static void displayEmployeeList() {
        System.out.printf("%-5s %-20s %-15s %-20s %-10s%n", "ID", "Name", "Phone", "Address", "Salary");
        System.out.println("--------------------------------------------------------------------------");

        for (Employee employee : employees) {
            System.out.printf("%-5d %-20s %-15s %-20s %-10.2f%n", 
                              employee.getId(), 
                              employee.getName(), 
                              employee.getPhone(), 
                              employee.getAddress(), 
                              employee.getSalary());
        }
    }

    private static void showHighestSalaryEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        Employee highestSalaryEmployee = Collections.max(employees, Comparator.comparing(Employee::getSalary));
        System.out.printf("%-5s %-20s %-15s %-20s %-10s%n", "ID", "Name", "Phone", "Address", "Salary");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-5d %-20s %-15s %-20s %-10.2f%n", 
                          highestSalaryEmployee.getId(), 
                          highestSalaryEmployee.getName(), 
                          highestSalaryEmployee.getPhone(), 
                          highestSalaryEmployee.getAddress(), 
                          highestSalaryEmployee.getSalary());
    }

    private static void displaySortedEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        System.out.printf("%-5s %-20s %-15s %-20s %-10s%n", "ID", "Name", "Phone", "Address", "Salary");
        System.out.println("--------------------------------------------------------------------------");
        for (Employee employee : employees) {
            System.out.printf("%-5d %-20s %-15s %-20s %-10.2f%n", 
                              employee.getId(), 
                              employee.getName(), 
                              employee.getPhone(), 
                              employee.getAddress(), 
                              employee.getSalary());
        }
    }

}

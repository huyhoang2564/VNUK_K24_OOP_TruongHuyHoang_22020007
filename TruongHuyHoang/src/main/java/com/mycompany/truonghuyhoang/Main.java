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
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input employee");
            System.out.println("2. Display employee list");
            System.out.println("3. Show best employee");
            System.out.println("4. Display sorted employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputEmployee(sc);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    showBestEmployee();
                    break;
                case 4:
                    displaySortedEmployees();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void inputEmployee(Scanner scanner) {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter employee address: ");
        String address = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        employees.add(new Employee(id, name, phone, address, salary));
        System.out.println("Employee added successfully.");
    }

    private static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.printf("%-10s %-20s %-15s %-25s %-10s\n", "ID", "Name", "Phone", "Address", "Salary");
            for (Employee emp : employees) {
                System.out.printf("%-10d %-20s %-15s %-25s %-10.2f\n", emp.getId(), emp.getName(), emp.getPhone(), emp.getAddress(), emp.getSalary());
            }
        }
    }

    private static void showBestEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            Employee bestEmployee = Collections.max(employees, Comparator.comparingDouble(Employee::getSalary));
            System.out.println("Best employee:");
            System.out.printf("%-10d %-20s %-15s %-25s %-10.2f\n", bestEmployee.getId(), bestEmployee.getName(), bestEmployee.getPhone(), bestEmployee.getAddress(), bestEmployee.getSalary());
        }
    }

    private static void displaySortedEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to sort.");
        } else {
            employees.sort(Comparator.comparingDouble(Employee::getSalary));
            System.out.println("Employees sorted by salary (lowest to highest):");
            displayEmployees();
        }
    }
}

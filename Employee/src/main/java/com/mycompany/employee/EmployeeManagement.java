/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author ASUS
 */
    
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManagement {

    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadEmployeesFromFile("test.txt");
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    inputEmployee();
                    break;
                case 2:
                    displayEmployeeList();
                    break;
                case 3:
                    displayBestEmployees();
                    break;
                case 4:
                    displaySortedEmployeeList();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        } while (choice != 0);
    }

    private static void loadEmployeesFromFile(String fileName) {
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ", 5); // Split into 5 parts
                int id = Integer.parseInt(parts[0]);
                String name = parts[1] + " " + parts[2];
                String address = parts[3];
                String phone = parts[4];
                double salary = Double.parseDouble(parts[5]);

                Employee employee = new Employee(id, name, address, phone, salary);
                employees.add(employee);
            }
            fileScanner.close();
            System.out.println("Employees loaded successfully from " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    private static void showMenu() { //Hien thi menu
        System.out.println("----- MANAGEMENT -----");
        System.out.println("Press 1. Input employee");
        System.out.println("Press 2. Display employee list");
        System.out.println("Press 3. Best employees");
        System.out.println("Press 4. Display sorted employee list");
        System.out.println("Press 0. Exit");
        System.out.print("Choose: ");
    }

    private static void inputEmployee() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, address, phone, salary);
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    private static void displayEmployeeList() {
        System.out.println(String.format("%-5s %-20s %-15s %-30s %s", "ID", "Name", "Phone", "Address", "Salary"));
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    private static void displayBestEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the list.");
            return;
        }
        double maxSalary = Collections.max(employees, Comparator.comparingDouble(Employee::getSalary)).getSalary();
        System.out.println("Best employees (highest salary):");
        for (Employee emp : employees) {
            if (emp.getSalary() == maxSalary) {
                System.out.println(emp);
            }
        }
    }

    private static void displaySortedEmployeeList() {
        ArrayList<Employee> sortedList = new ArrayList<>(employees);
        sortedList.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employees sorted by salary:");
        displayEmployeeList();
    }
}

// Class to represent an employee node in the linked list
class Employee {
    String id;         // Employee ID
    String name;       // Employee Name
    float salary;      // Employee Salary
    String department; // Employee Department
    Employee next;     // Reference to the next employee node

    // Constructor to initialize employee node
    public Employee(String id, String name, float salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.next = null; // Next is set to null when a node is created
    }
}

// LinkedList class to manage employee records
class EmployeeLinkedList {
    Employee head; // Head of the list, pointing to the first employee

    // Constructor to initialize an empty list
    public EmployeeLinkedList() {
        this.head = null; // Initially, the list is empty
    }

    // Method to insert a new employee at the end of the list
    public void insertEmployee(String id, String name, float salary, String department) {
        Employee newEmployee = new Employee(id, name, salary, department); // Create a new employee node

        // Check if the list is empty
        if (head == null) {
            head = newEmployee; // New employee becomes the head if the list is empty
        } else {
            Employee temp = head; // Start from the head
            while (temp.next != null) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newEmployee; // Append the new employee at the end
        }
        System.out.println("Employee added: " + name);
    }

    // Method to display all employees in the list
    public void displayAllEmployees() {
        if (head == null) {
            System.out.println("No employees to display.");
            return;
        }

        Employee temp = head;
        System.out.println("All Employees:");
        // Traverse the list and print each employee's details
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Salary: " + temp.salary + ", Department: " + temp.department);
            temp = temp.next; // Move to the next employee
        }
    }

    // Method to list employees by department
    public void listEmployeesByDepartment(String department) {
        if (head == null) {
            System.out.println("No employees to display.");
            return;
        }

        Employee temp = head;
        boolean found = false;
        System.out.println("Employees in Department: " + department);
        // Traverse the list and print employees in the specified department
        while (temp != null) {
            if (temp.department.equalsIgnoreCase(department)) {
                System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Salary: " + temp.salary);
                found = true;
            }
            temp = temp.next; // Move to the next employee
        }
        if (!found) {
            System.out.println("No employees found in the " + department + " department.");
        }
    }

    // Method to delete an employee by their ID
    public void deleteEmployeeByID(String id) {
        if (head == null) {
            System.out.println("The list is empty, no employee to delete.");
            return;
        }

        // If the head node is the one to be deleted
        if (head.id.equals(id)) {
            System.out.println("Employee deleted: " + head.name);
            head = head.next; // Update the head to the next employee
            return;
        }

        Employee temp = head;
        Employee prev = null;

        // Traverse the list to find the employee by ID
        while (temp != null && !temp.id.equals(id)) {
            prev = temp;         // Track the previous node
            temp = temp.next;    // Move to the next node
        }

        // If employee with the given ID was not found
        if (temp == null) {
            System.out.println("Employee with ID " + id + " not found.");
            return;
        }

        // Unlink the employee node from the list
        prev.next = temp.next;
        System.out.println("Employee deleted: " + temp.name);
    }
}

// Main class to test the employee management system
public class Main {
    public static void main(String[] args) {
        EmployeeLinkedList list = new EmployeeLinkedList();

        // Adding employees
        list.insertEmployee("E001", "John Doe", 50000, "HR");
        list.insertEmployee("E002", "Jane Smith", 60000, "IT");
        list.insertEmployee("E003", "Samuel Green", 55000, "HR");
        list.insertEmployee("E004", "Alice Brown", 70000, "Finance");

        // Display all employees
        list.displayAllEmployees();

        // List employees by department
        list.listEmployeesByDepartment("HR");

        // Deleting an employee by ID
        list.deleteEmployeeByID("E002");

        // Display all employees after deletion
        list.displayAllEmployees();
    }
}

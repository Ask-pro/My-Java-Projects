public class Company { // Main class
    private String name; // Employee name
    String company;      // Company name
    private int id;      // Employee ID

    public void setName(String name) { // Set name
        this.name = name; // Initialize name
    }

    public String getName() { // Get name
        return name; // Return name
    }

    public void setId(int id) { // Set ID
        this.id = id; // Initialize ID
    }

    public int getId() { // Get ID
        return id; // Return ID
    }

    void displaymessage(String company) { // Display message
        System.out.println("Welcome to " + company + "! Below are the employee details."); // Print message
    }

    void displayinfo() { // Display info
        System.out.println("Employee Name: " + getName() + "\t" + "Employee ID: " + getId()); // Print info
    }

    static class Employee extends Company { // Employee class
        private String salary;   // Employee salary
        private String department; // Department name

        public Employee(String name, int id, String salary, String department) { // Constructor
            super.setName(name); // Set name
            super.setId(id);     // Set ID
            this.salary = salary; // Initialize salary
            this.department = department; // Initialize department
        }

        void displayinfo() { // Override method
            super.displayinfo(); // Display parent info
            System.out.println("Works in the department " + department + ", with a salary of " + salary + ".\n"); // Print department info
        }
    }
}

class company_main { // Main class
    public static void main(String[] args) { // Main method
        Company.Employee[] employee = new Company.Employee[3]; // Employee array

        employee[0] = new Company.Employee("Anu", 1, "13 LPA", "E-Commerce"); // Employee 1
        employee[0].displaymessage("HW"); // Display message

        employee[1] = new Company.Employee("Sri", 2, "15 LPA", "Insurance"); // Employee 2
        employee[2] = new Company.Employee("Anusri", 3, "16 LPA", "Banking"); // Employee 3

        for (Company.Employee employees : employee) { // Loop through employees
            employees.displayinfo();  // Display info
        }
    }
}

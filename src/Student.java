public class Student {
    // Declaration of instance variables to hold student details
    String name;
    int age;
    int id;
    String house;

    // Constructor to initialize instance variables with provided values
    public Student(String studentname, int studentage, int studentid, String studenthouse) {
        name = studentname;     
        age = studentage;
        id = studentid;
        house = studenthouse;
    }

    // Method to display details of a specific student (using instance variables)
    void displaydetails() {
        System.out.println("Name of the student: " + name);   // Print student's name
        System.out.println("Age: " + age);                    // Print student's age
        System.out.println("Enrollment Number: " + id);       // Print student's enrollment ID
        System.out.println("House Name: " + house + "\n");    // Print student's house name
    }

    // Overloaded method to display student details (using parameters passed to the method)
    void displaydetails(String name, int age, int id) {
        System.out.println("Name of the student: " + name);   // Print passed student's name
        System.out.println("Age: " + age);                    // Print passed student's age
        System.out.println("Enrollment Number: " + id);       // Print passed student's enrollment ID
    }

    // Method to display a welcome message
    void displaymessage() {
        System.out.println("Welcome to Hogwarts!" + " " + "Here is the list of the student details:\n");
    }

    // Main method where the program starts execution
    public static void main(String[] args) {

        // Creating Student instances by passing values to the constructor
        Student student1 = new Student("Harry Potter", 20, 1, "Gryffindor");
        Student student2 = new Student("Hermione Granger", 19, 2, "Gryffindor");
        Student student3 = new Student("Ron Weasley", 19, 3, "Gryffindor");
        Student student4 = new Student("Draco Malfoy", 20, 4, "Slytherin");
        Student student5 = new Student("Neville Longbottom", 21, 5, "Gryffindor");

        student1.displaymessage();  // Call method to display the welcome message

        // Call method to display student details for each student
        student1.displaydetails();  // Display details for student1 (using instance variables)
        student2.displaydetails();  // Display details for student2 (using instance variables)
        student3.displaydetails();  // Display details for student3 (using instance variables)
        student4.displaydetails();  // Display details for student4 (using instance variables)
        student5.displaydetails("Neville Longbottom", 21, 5);  // Display details for student5 (using passed arguments)
    }
}

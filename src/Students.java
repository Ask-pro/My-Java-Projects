public class Students { // Main class

    static class School {
        String name;   // Student's name
        int age;       // Student's age

        // Parent constructor: Initializes name and age
        public School(String studentname, int studentage) {
            name = studentname; // Initialize name
            age = studentage;   // Initialize age
        }

        void displaymessage() {
            System.out.println("Welcome to Hogwarts!\nHere is the list of student details:\n"); // Welcome message
        }

        void displayinfo() {
            System.out.println("Name of the student: " + name); // Print name
            System.out.println("Age: " + age); // Print age
        }
    }

    static class Student extends School {
        int id;       // Enrollment ID
        String house; // House name

        // Subclass constructor: Calls parent constructor and initializes additional properties
        public Student(String name, int age, int studentid, String studenthouse) {
            super(name, age); // Call the parent class constructor (School) to set name and age
            id = studentid;   // Initialize ID specific to Student class
            house = studenthouse; // Initialize house specific to Student class
        }

        void displayinfo() { //method overriding as sub class use same method as superclass
            super.displayinfo();  // Display name and age from parent class, user super since it is method override
            System.out.println("Enrollment Number: " + id); // Print ID
            System.out.println("House Name: " + house + "\n"); // Print house
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5]; // Array of 5 students

        students[0] = new Student("Harry Potter", 20, 1, "Gryffindor"); // Student 1
        students[1] = new Student("Hermione Granger", 19, 2, "Gryffindor"); // Student 2
        students[2] = new Student("Ron Weasley", 19, 3, "Gryffindor"); // Student 3
        students[3] = new Student("Draco Malfoy", 17, 4, "Slytherin"); // Student 4
        students[4] = new Student("Neville Longbottom", 21, 5, "Gryffindor"); // Student 5

        students[0].displaymessage(); // Display welcome message

        for (Student student : students) { // Loop through each student
            student.displayinfo();  // Display student details
        }
    }
}

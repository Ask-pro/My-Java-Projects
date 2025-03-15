abstract class School {
    private String name;   // Student name
    private int age;       // Student age

    // Set name
    public void setName(String name) {
        this.name = name; // Set name
    }

    // Get name
    public String getName() {
        return name; // Get name
    }

    // Set age
    public void setAge(int age) {
        this.age = age; // Set age
    }

    // Get age
    public int getAge() {
        return age; // Get age
    }

    // Display message
    void displaymessage() {
        System.out.println("Welcome to Hogwarts!\nHere is the list of student details:\n"); // Show message
    }

    // Abstract method
    abstract void displayinfo(); // Abstract method
}

class Student extends School {
    private int id;       // Student ID
    private String house; // Student house

    // Constructor
    public Student(String name, int age, int id, String house) {
        super.setAge(age); // Set age
        super.setName(name); // Set name
        this.id = id;   // Set ID
        this.house = house; // Set house
    }

    // Display student info
    void displayinfo() { // Override method
        System.out.println("Name of the student: " + getName()); // Print name
        System.out.println("Age: " + getAge()); // Print age
        System.out.println("Enrollment Number: " + id); // Print ID
        System.out.println("House Name: " + house + "\n"); // Print house
    }
}

class students_main {
    public static void main(String[] args) {
        // Declare an array of type School instead of Student
        // This allows us to store objects of type School or any subclass of School (like Student)
        School[] school = new School[5]; // Array of School type

        // Create Student objects and assign them to the School array
        school[0] = new Student("Hermione", 15, 1, "Gryffindor"); // Student 1
        school[1] = new Student("Harry", 11, 2, "Gryffindor"); // Student 2
        school[2] = new Student("Ron", 13, 3, "Gryffindor"); // Student 3
        school[3] = new Student("Draco", 16, 4, "Slytherin"); // Student 4
        school[4] = new Student("Neville", 16, 5, "Gryffindor"); // Student 5

        // Show the welcome message for the first student
        school[0].displaymessage(); // Show message

        /* Loop through each element in the array and call the displayinfo() method
        Polymorphism: even though the array is of type School, we are calling the displayinfo method
        of the actual object type (Student). The correct displayinfo() method is called at runtime.*/
        for (School student : school) { // Loop through array
            student.displayinfo();  // Polymorphic method call
        }
    }
}

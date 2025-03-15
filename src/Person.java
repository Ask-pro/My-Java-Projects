public class Person { //Hierarchial
    String name; // Person name
    int age; // Person age

    // Parent constructor
    public Person(String person_name, int person_age) {
        name = person_name; // Assign name
        age = person_age; // Assign age
    }

    void board() { System.out.println("Hello! I am a teacher."); } // Default board

    void board(int age) { // Overloaded board
        if (age < 18) {
            System.out.println("Hello! I am a student.");
        }
    }

    void introduce() { // Introduce method
        System.out.println("This is " + name + ". I am " + age + " years old.");
    }

    static class Student extends Person { // Student subclass
        String school_name; // School name
        String house; // House name

        // Student constructor
        public Student(String student_name, int student_age, String student_school, String student_class) {
            super(student_name, student_age); // Call parent constructor
            school_name = student_school; // Assign school
            house = student_class; // Assign house
        }

        void introduce() { // Override introduce
            super.introduce(); // Call parent introduce
            System.out.print("I am studying in " + school_name + ". I belong to " + house + "!\n\n");
        }
    }

    static class Teacher extends Person { // Teacher subclass
        String subject; // Teaching subject

        // Teacher constructor
        public Teacher(String teacher_name, int teacher_age, String teacher_subject) {
            super(teacher_name, teacher_age); // Call parent constructor
            subject = teacher_subject; // Assign subject
        }

        void introduce() { // Override introduce
            super.introduce(); // Call parent introduce
            System.out.print("I teach " + subject + ".\n\n");
        }
    }
}

class Person_main {
    public static void main(String[] args) {
        // Teacher array
        Person[] person = new Person[5];
        person[0] = new Person.Teacher("Hagrid", 29, "Charms");
        person[1] = new Person.Teacher("Lupus", 35, "Dark Arts");
        person[2] = new Person.Teacher("Mc.Gonagall", 45, "Wizardry");
        person[3] = new Person.Teacher("Snape ", 65, "Potions");
        person[4] = new Person.Teacher("Dumbledore", 75, "Magic");


        // Loop through teachers
        for (Person teachers : person) {
            teachers.board(); // Call board
            teachers.introduce(); // Call introduce
        }

        // Student array
        person[0] = new Person.Student("Harry", 9, "Hogwarts", "Gryffindor");
        person[1] = new Person.Student("Ron", 11, "Hogwarts", "Gryffindor");
        person[2] = new Person.Student("Hermoine", 15, "Hogwarts", "Gryffindor");
        person[3] = new Person.Student("Draco", 15, "Ministry of Magic", "Slytherin");
        person[4] = new Person.Student("Neville", 15, "Hogwarts", "Hufflepuff");

        // Loop through students
        for (Person students : person) {
            students.board(students.age); // Call overloaded board
            students.introduce(); // Call introduce
        }
    }
}

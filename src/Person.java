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
            System.out.print("I am teaching " + subject + ".\n\n");
        }
    }
}

class Person_main {
    public static void main(String[] args) {
        // Teacher array
        Person.Teacher[] teacher = new Person.Teacher[3];
        teacher[0] = new Person.Teacher("Anu", 29, "Maths");
        teacher[1] = new Person.Teacher("Sri", 35, "Science");
        teacher[2] = new Person.Teacher("Anu Sri", 45, "English");

        // Loop through teachers
        for (Person.Teacher teachers : teacher) {
            teachers.board(); // Call board
            teachers.introduce(); // Call introduce
        }

        // Student array
        Person.Student[] student = new Person.Student[5];
        student[0] = new Person.Student("Harry", 9, "Hogwarts", "Gryffindor");
        student[1] = new Person.Student("Ron", 11, "Hogwarts", "Gryffindor");
        student[2] = new Person.Student("Hermoine", 15, "Hogwarts", "Gryffindor");
        student[3] = new Person.Student("Draco", 15, "Ministry of Magic", "Slytherin");
        student[4] = new Person.Student("Neville", 15, "Hogwarts", "Hufflepuff");

        // Loop through students
        for (Person.Student students : student) {
            students.board(students.age); // Call overloaded board
            students.introduce(); // Call introduce
        }
    }
}

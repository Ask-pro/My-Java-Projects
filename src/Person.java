public class Person{
    String name;
    int age;

    //Parent constructor
    public Person(String person_name, int person_age) {
        name = person_name;
        age = person_age;
    }

    void introduce() {
        System.out.println("Hello! This is " + name + ". I am " + age + " years old.");
    }

    static class Student extends Person {
        String school_name;
        String house;

        public Student(String student_name, int student_age, String student_school, String student_class) {
            super(student_name, student_age);
            school_name = student_school;
            house = student_class;
        }

        void introduce(){
            super.introduce();
            System.out.println("I am studying in "+school_name+". I belong to "+house+"!\n");
        }
    }

    static class Teacher extends Person {
        String subject;
        public Teacher(String teacher_name, int teacher_age, String teacher_subject) {
            super(teacher_name, teacher_age);
            subject = teacher_subject;
        }

        void introduce(){
            super.introduce();
            System.out.println("I am teaching "+subject+".\n");
        }
    }
}

class Person_main{
    public static void main(String[] args){
        Person.Teacher[] teacher = new Person.Teacher[3];
        teacher[0] = new Person.Teacher("Anu",29,"Maths");
        teacher[1] = new Person.Teacher("Sri",31,"Science");
        teacher[2] = new Person.Teacher("Anu Sri",45,"English");

        for (Person.Teacher teachers: teacher){
            teachers.introduce();
        }

        Person.Student[] student = new Person.Student[5];
        student[0] = new Person.Student("Harry",9,"Hogwarts","Gryffindor");
        student[1] = new Person.Student("Ron",11,"Hogwarts","Gryffindor");
        student[2] = new Person.Student("Hermoine",15,"Hogwarts","Gryffindor");
        student[3] = new Person.Student("Draco",15,"Ministry of Magic","Slytherin");
        student[4] = new Person.Student("Neville",15,"Hogwarts","Hufflepuff");

        for (Person.Student students: student){
            students.introduce();
        }
    }
}
public class Student{
    // Method to display details of specific student
     void displaydetails(String name, int age, int id){
        System.out.println("Name of the student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Enrollment Number: " + id + "\n");
     }

     // Method to display welcome message
    void displaydetails(){
         System.out.println("Welcome to Hogwarts!" + "\n" + "Here is the list of the student details:");
    }

    public static void main(String[] args){

         //Creating Student instances
         Student student1 = new Student();
         Student student2 = new Student();
         Student student31 = new Student();
         Student student451 = new Student();
         Student student56 = new Student();

         student1.displaydetails(); // Calling method to display welcome message

        // Calling method to display student details
         student1.displaydetails("Harry Potter",20,1); //student1
         student2.displaydetails("Hermoine Granger",19,2); //student2
         student31.displaydetails("Ron Weasley",19,3); //student3
         student451.displaydetails("Draco Malfoy",20,4); //student4
         student56.displaydetails("Neville Longbottom",21,5); //student5
    }
}
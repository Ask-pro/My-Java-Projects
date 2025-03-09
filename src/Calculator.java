public class Calculator {
    void details(){ // Welcome message
        System.out.println("Please choose your action from below.\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
    }

    //Method to add numbers
    int add(int number1, int number2){
        int total = number1+number2;
        System.out.println("Sum of "+number1+ " and " + number2+" is "+total);
        return total;
    }

    //Method to subtract numbers
    int sub(int number1, int number2){
        int total = number1-number2;
        System.out.println("Subtraction of "+number1+ " and " + number2+" is "+total);
        return total;
    }

    //Method to multiply numbers
    int multiply(int number1, int number2){
        int total = number1*number2;
        System.out.println("Multiplication of "+number1+ " and " + number2+" is "+total);
        return total;
    }

    //Method to divide numbers
    int division(int number1, int number2){
        if (number2 != 0) {
            int total = number1 / number2;
            int reminder = number1 % number2;
            System.out.println("Quotient of " + number1 + " and " + number2 + " is " + total + ". Reminder is " + reminder);
            return total;
        } else {
            System.out.println("Invalid action. System cannot divide the number by zero. Please try again.");
            return 1;
        }
    }

    public static void main(String[] args){
        Calculator calc = new Calculator(); // Creating an instance
        calc.details();
        int action = 5;
        if(action==1){
            calc.add(10,5); // Adding 2 numbers
        } else if (action ==2){
            calc.sub(10,1); // Subtracting 2 numbers
        } else if (action ==3){
            calc.multiply(15,3); // Multiplying 2 numbers
        } else if (action ==4){
            calc.division(30,5); // Dividing 2 numbers
        } else {
            System.out.println("Invalid option."); 
        }
    }

}
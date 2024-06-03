package Session_4_Working_with_Java_Conditional_Statements.task_09_assignments;

public class Assignment_01 {
    public static void main(String[] args) {

        // 1.	Largest of 2 numbers

        int num1=10,num2=20;

        // if - else
        if(num1>num2)
            System.out.println("Largest number is : " +num1);
        else
            System.out.println("Largest number is : " +num2);

        // Using ternary operator
        int largest = (num1 > num2) ? num1 : num2;
        System.out.println("Largest number is: " + largest);
    }
}

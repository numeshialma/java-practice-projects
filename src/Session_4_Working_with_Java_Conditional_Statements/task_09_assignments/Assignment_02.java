package Session_4_Working_with_Java_Conditional_Statements.task_09_assignments;

public class Assignment_02 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;

        int smallest = num1;

        // Using if-else
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("Smallest number is: " + smallest);
    }
}

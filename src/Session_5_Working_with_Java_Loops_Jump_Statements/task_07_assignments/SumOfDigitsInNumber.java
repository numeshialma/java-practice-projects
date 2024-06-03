package Session_5_Working_with_Java_Loops_Jump_Statements.task_07_assignments;

public class SumOfDigitsInNumber {

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            num /= 10; // Remove the last digit from the number
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 465876;
        int sum= sumOfDigits(number);

        System.out.println("Sum of digits in " + number + ": " + sum);

    }
}

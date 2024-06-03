package Session_5_Working_with_Java_Loops_Jump_Statements.task_07_assignments;

public class ReverseNumber {

    public static int reverse(int originalNumber){
        int reversed = 0;

        while (originalNumber!=0){
            int digit = originalNumber%10; // Extract the last digit
            reversed = reversed*10+digit;  // Append the digit to the reversed number
            originalNumber/=10; // Remove the last digit from the original number
        }
        return reversed;
    }

    public static void main(String[] args) {
        int originalNumber=12345;
        int reversedNumber=reverse(originalNumber);

        System.out.println("Reversed number : " +reversedNumber);

    }
}

package Session_5_Working_with_Java_Loops_Jump_Statements.task_07_assignments;

public class CountEvenOddDigits {

    public static void countEvenOdd(int num) {
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num /= 10;
        }

        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
    }

    public static void main(String[] args) {
        int number = 465876;
        countEvenOdd(number);
    }

}

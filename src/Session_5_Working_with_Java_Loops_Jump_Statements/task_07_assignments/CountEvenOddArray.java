package Session_5_Working_with_Java_Loops_Jump_Statements.task_07_assignments;

public class CountEvenOddArray {
    public static void countEvenOdd(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        countEvenOdd(numbers);
    }
}

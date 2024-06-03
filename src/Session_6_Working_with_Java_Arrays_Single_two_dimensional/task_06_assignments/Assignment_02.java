package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_06_assignments;

public class Assignment_02 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd numbers
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

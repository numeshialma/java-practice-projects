package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_06_assignments;

public class Assignment_02_1 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};

        int evenCount = countEvenNumbers(a);
        int oddCount = countOddNumbers(a);

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

    // Method to count even numbers in the array
    public static int countEvenNumbers(int[] a) {
        int evenCount = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    // Method to count odd numbers in the array
    public static int countOddNumbers(int[] a) {
        int oddCount = 0;
        for (int num : a) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }
}

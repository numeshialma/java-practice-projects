package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_06_assignments;

public class Assignment_01_1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = calculateSum(a);
        System.out.println("Sum of elements in the array: " + sum);
    }

    // Method to calculate the sum of elements in the array
    public static int calculateSum(int[] a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }
}

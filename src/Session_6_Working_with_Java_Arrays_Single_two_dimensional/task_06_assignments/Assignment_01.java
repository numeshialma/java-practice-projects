package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_06_assignments;

public class Assignment_01 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        // Calculate sum of elements
        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of elements in the array: " + sum);
    }
}

package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_06_assignments;

public class Assignment_03 {
    public static void main(String[] args) {

        int num = 29; // Change this number to test

        boolean isPrime = true;

        // Check if the number is divisible by any number other than 1 and itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (num <= 1) {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

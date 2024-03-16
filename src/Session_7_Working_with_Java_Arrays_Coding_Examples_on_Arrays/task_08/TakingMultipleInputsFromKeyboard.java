package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_08;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Addition of 2 numbers : "+(num1+num2));
    }
}

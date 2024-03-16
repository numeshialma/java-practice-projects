package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_07;

import java.util.Scanner;

public class TakingInputFromKeyboard {

    public static void main(String[] args) {

        // int num = 20;  // hard coded value

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Given number is : " +num);
    }
}
/*
Enter a number
7.56
Exception in thread "main" java.util.InputMismatchException
 */
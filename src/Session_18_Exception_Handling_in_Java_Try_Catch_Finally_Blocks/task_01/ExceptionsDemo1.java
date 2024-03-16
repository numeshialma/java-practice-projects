package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_01;

import java.util.Scanner;

public class ExceptionsDemo1 {
    public static void main(String[] args) {

        System.out.println("Program is started..");

        Scanner sc = new Scanner(System.in);

        // Example 1
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println(100/num);  // ArithmeticException

        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
/* output :
Program is started..
Enter a number :
0

error : ArithmeticException
 */
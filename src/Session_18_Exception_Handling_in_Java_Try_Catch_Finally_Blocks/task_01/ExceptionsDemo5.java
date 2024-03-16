package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_01;

import java.util.Scanner;

public class ExceptionsDemo5 {
    public static void main(String[] args) {

        System.out.println("Program is started..");

        Scanner sc = new Scanner(System.in);

        // Example 3

        String s = "welcome";
        int num = Integer.parseInt(s);   //  NumberFormatException
        System.out.println(num);

        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
/* output :
Program is started..

error : NumberFormatException
 */
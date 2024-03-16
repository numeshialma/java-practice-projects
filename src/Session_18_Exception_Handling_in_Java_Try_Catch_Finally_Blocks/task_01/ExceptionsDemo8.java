package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_01;

import java.util.Scanner;

public class ExceptionsDemo8 {
    public static void main(String[] args) {

        System.out.println("Program is started..");

        Scanner sc = new Scanner(System.in);

        // Example 4

        String s = null;
        System.out.println(s.length());   // NullPointerException

        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
/* output :
Program is started..

error : NullPointerException
 */
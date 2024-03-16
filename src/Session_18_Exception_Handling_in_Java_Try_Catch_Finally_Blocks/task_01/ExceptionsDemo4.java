package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_01;

import java.util.Scanner;

public class ExceptionsDemo4 {
    public static void main(String[] args) {

        System.out.println("Program is started..");

        Scanner sc = new Scanner(System.in);

        // Example 3

        String s = "12345";
        int num = Integer.parseInt(s);
        System.out.println(num);

        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
/* output :
Program is started..
12345
Program is completed..
Program is exited..
 */
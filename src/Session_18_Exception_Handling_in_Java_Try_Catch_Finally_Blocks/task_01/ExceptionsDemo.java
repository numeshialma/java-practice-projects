package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_01;

import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {

        System.out.println("Program is started..");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println(100/num);

        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
/* output :
Program is started..
Enter a number :
5
20
Program is completed..
Program is exited..
 */
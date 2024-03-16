package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_01;

import java.util.Scanner;

public class ExceptionsDemo3 {
    public static void main(String[] args) {

        System.out.println("Program is started..");

        Scanner sc = new Scanner(System.in);

        // Example 2

        int a[] = new int[5];

        System.out.println("Enter the position(0-4)");
        int pos=sc.nextInt();

        System.out.println("Enter a value : ");
        int value = sc.nextInt();

        a[pos]=value;   // ArrayIndexOutOfBoundsException

        System.out.println(a[pos]);

        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
/* output :
Program is started..
Enter the position(0-4)
5
Enter a value :
100

error : ArrayIndexOutOfBoundsException
 */
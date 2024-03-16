package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_08;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Your name is  : "+name);

        System.out.println("Enter age : ");
        int age = sc.nextInt();
        System.out.println("Your age is : "+age);

        System.out.println("Enter unknown value : ");
        Object value = sc.next();
        System.out.println("Unknown value is : "+value);

    }
}
/*
Enter name :
John
Your name is  : John
Enter age :
67
Your age is : 67
Enter unknown value :
100
Unknown value is : 100
 */

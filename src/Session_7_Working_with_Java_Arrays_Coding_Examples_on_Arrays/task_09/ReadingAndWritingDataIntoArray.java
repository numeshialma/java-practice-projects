package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_09;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

    public static void main(String[] args) {

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            System.out.println("Enter a value : ");
            a[i] = sc.nextInt();

        }
        System.out.println("Printing array elements...");
        System.out.println(Arrays.toString(a));

    }
}
/*
Enter a value :
5
Enter a value :
6
Enter a value :
3
Enter a value :
6
Enter a value :
98
Printing array elements...
[5, 6, 3, 6, 98]
 */

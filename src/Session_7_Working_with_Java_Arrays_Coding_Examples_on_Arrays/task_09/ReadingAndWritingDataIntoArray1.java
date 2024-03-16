package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_09;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray1 {

    public static void main(String[] args) {

        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            System.out.println("Enter a value for the position " +i+ " : ");
            a[i] = sc.nextInt();

        }
        System.out.println("Printing array elements...");
        System.out.println(Arrays.toString(a));

    }
}
/*
Enter a value for the position 0 :
6
Enter a value for the position 1 :
7
Enter a value for the position 2 :
3
Enter a value for the position 3 :
5
Enter a value for the position 4 :
5
Printing array elements...
[6, 7, 3, 5, 5]
 */

package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_02;

import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args) {

        int a[] = {20,10,40,50,30};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);   // mutable
        System.out.println(Arrays.toString(a));

        /* output
        [20, 10, 40, 50, 30]
        [10, 20, 30, 40, 50]
         */
    }
}

package Session_8_Working_with_Java_Strings_String_Methods.task_11;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        String s = "abc,123@xyz";   // abc   123   xyz

        String arr1[] = s.split(",");   // abc 123@xyz
        System.out.println(Arrays.toString(arr1)) ;   // [abc, 123@xyz]

        String arr2[] = arr1[1].split("@");
        System.out.println(Arrays.toString(arr2));   //[123, xyz]

        System.out.println(arr1[0]); //  abc
        System.out.println(arr2[0]);  // 123
        System.out.println(arr2[1]);   // xyz




    }
}

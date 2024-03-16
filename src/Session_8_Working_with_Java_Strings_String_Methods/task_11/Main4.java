package Session_8_Working_with_Java_Strings_String_Methods.task_11;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {

        String s = "abc 123 xyz";
        String ar[] = s.split(" ");
        System.out.println(Arrays.toString(ar));   // output : [abc, 123, xyz]

    }
}

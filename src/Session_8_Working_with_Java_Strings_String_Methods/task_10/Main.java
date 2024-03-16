package Session_8_Working_with_Java_Strings_String_Methods.task_10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String s = "abc@gmail.com";

        String a[] = s.split("@");
        System.out.println(a[0]);  // abc
        System.out.println(a[1]);  // @gmail.com

        String st = "abc123@gmail.com";

        String b[] = st.split("@");
        System.out.println(b[0]);  // abc123
        System.out.println(b[1]);  // @gmail.com

        System.out.println(Arrays.toString(a));   //[abc, gmail.com]
        System.out.println(Arrays.toString(b));   //[abc123, gmail.com]
    }
}

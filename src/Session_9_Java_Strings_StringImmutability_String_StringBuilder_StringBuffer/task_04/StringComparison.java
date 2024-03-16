package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_04;

public class StringComparison {
    public static void main(String[] args) {

        // 1.
        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        /* output :
        true
        true
         */

    }
}

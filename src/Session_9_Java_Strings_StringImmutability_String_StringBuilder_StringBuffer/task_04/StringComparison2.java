package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_04;

public class StringComparison2 {
    public static void main(String[] args) {

        // 3.
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1==s2);  // to compare the objects
        System.out.println(s1.equals(s2));  // to compare values of the objects

        /* output :
        false
        true
         */

    }
}

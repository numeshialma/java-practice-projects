package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_04;

public class StringComparison1 {
    public static void main(String[] args) {

        // 2.
        String s1 = new String("welcome");
        String s2 = new String("welcome");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s2);  // to compare the objects
        System.out.println(s1.equals(s2));  // to compare values of the objects

        /* output :
        welcome
        welcome
        false
        true
         */

    }
}

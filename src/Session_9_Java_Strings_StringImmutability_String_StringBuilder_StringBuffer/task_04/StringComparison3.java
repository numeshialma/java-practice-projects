package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_04;

public class StringComparison3 {
    public static void main(String[] args) {

        // 4.
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = s2;

        System.out.println(s1==s2);  // to compare the objects
        System.out.println(s1.equals(s2));  // to compare values of the objects

        System.out.println(s2==s3);    // same object . so true
        System.out.println(s2.equals(s3));  // true

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        /* output :
        false
        true

        true
        true

        false
        true

         */
    }
}

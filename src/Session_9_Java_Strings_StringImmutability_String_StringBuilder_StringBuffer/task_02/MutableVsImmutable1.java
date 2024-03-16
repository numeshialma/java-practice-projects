package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_02;

public class MutableVsImmutable1 {
    public static void main(String[] args) {

        // immutable
        String s = new String("welcome");
        System.out.println(s);
        s.concat("to java");
        System.out.println(s);

        /* output
        welcome
        welcome
         */
    }
}

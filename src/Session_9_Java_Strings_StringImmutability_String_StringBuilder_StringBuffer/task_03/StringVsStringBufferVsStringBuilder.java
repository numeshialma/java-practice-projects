package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_03;

public class StringVsStringBufferVsStringBuilder {

    public static void main(String[] args) {

        // String - immutable
        String s = "welcome";
        s.concat("to java");
        System.out.println(s);  // immutable , cannot change original value
                                // output : welcome

        // StringBuffer - mutable
        StringBuffer s1 = new StringBuffer("welcome");
        s1.append("to java");
        System.out.println(s1);  // mutable , we can change original value
                                // output : welcometo java

        // StringBuilder - mutable
        StringBuilder s2 = new StringBuilder("welcome");
        s2.append("to java");
        System.out.println(s2); // mutable , we can change original value
                                // output : welcometo java

    }

}

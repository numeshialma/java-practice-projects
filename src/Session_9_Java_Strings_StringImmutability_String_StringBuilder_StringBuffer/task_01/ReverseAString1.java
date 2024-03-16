package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_01;

public class ReverseAString1 {
    public static void main(String[] args) {

        // Approach 1

        String s = "welcome";
        String rev = "";

        for(int i=s.length()-1; i>=0; i--){
            // System.out.print(s.charAt(i));

            // emoclew

            System.out.println(s.charAt(i));
            /*
            e
            m
            o
            c
            l
            e
            w
             */
        }
    }
}

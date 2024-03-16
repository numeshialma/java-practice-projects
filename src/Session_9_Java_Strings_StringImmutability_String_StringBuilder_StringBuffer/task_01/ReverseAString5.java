package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_01;

public class ReverseAString5 {
    public static void main(String[] args) {

        // Approach 3 - using StringBuffer Class
        StringBuffer s = new StringBuffer("welcome");

        System.out.println("Reverse String is :"+s.reverse());

    }
}

//  output : Reverse string is : emoclew
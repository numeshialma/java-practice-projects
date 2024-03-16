package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_01;

public class ReverseAString6 {
    public static void main(String[] args) {

        // Approach 4 - using StringBuilder Class
        StringBuilder s = new StringBuilder("welcome");

        System.out.println("Reverse String is :"+s.reverse());
        
    }
}

//  output : Reverse string is : emoclew
package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_01;

public class ReverseAString2 {
    public static void main(String[] args) {

        // Approach 1 - length() , charAt()

        String s = "welcome";
        String rev = "";

        for(int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("Reverse string is : " +rev);
    }
}

//  output : Reverse string is : emoclew
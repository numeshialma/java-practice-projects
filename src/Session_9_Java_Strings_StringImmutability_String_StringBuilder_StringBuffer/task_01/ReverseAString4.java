package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_01;

public class ReverseAString4 {
    public static void main(String[] args) {

        // Approach 2 - without using string methods
        // by converting string to char array type
        String s = "welcome";
        String rev = "";

        char a[] = s.toCharArray();

        for(int i= a.length-1; i>=0; i--){
            rev = rev+a[i];
        }
        System.out.println("Reverse string is : " +rev);

    }
}

//  output : Reverse string is : emoclew
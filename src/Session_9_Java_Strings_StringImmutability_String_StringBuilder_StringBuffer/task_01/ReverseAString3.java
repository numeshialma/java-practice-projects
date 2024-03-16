package Session_9_Java_Strings_StringImmutability_String_StringBuilder_StringBuffer.task_01;

public class ReverseAString3 {
    public static void main(String[] args) {

        // Approach 2 - without using string methods

        String s = "welcome";
        String rev = "";

        char a[] = s.toCharArray();

        for(int i= a.length-1; i>=0; i--){
            System.out.print(a[i]);
        }

         }
}

//  output : Reverse string is : emoclew
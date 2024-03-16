package Session_8_Working_with_Java_Strings_String_Methods.task_03;

public class Main1 {
    public static void main(String[] args) {

        String s = "   welcome   ";

        System.out.println("Before trimming : " +s.length());
        System.out.println(s.trim());
        System.out.println("After trimming : " +s.trim().length());

        /*
        Before trimming : 13
        welcome
        After trimming : 7
         */
    }
}

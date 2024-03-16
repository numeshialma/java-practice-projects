package Session_8_Working_with_Java_Strings_String_Methods.task_08;

public class Main {
    public static void main(String[] args) {

        String s = "welcome to selenium java selenium python selenium c#";

        // staring index - 0
        // ending index -1

        s="Selenium";
        System.out.println(s.substring(1,5));  // output : elen
        System.out.println(s.substring(0,1)); // S
        System.out.println(s.substring(0,3)); // Sel
        // System.out.println(s.substring(0,10)); // an error


    }
}

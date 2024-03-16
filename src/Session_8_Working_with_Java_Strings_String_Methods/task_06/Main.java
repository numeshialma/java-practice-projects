package Session_8_Working_with_Java_Strings_String_Methods.task_06;

public class Main {

    public static void main(String[] args) {

        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1==s2);   // output : true
        System.out.println(s1.equals(s2));   // output : true

        System.out.println(s1.equals("Welcome"));   // output : false
        // equals - case sensitive

        System.out.println(s1.equalsIgnoreCase("Welcome"));   // output : true


    }
}

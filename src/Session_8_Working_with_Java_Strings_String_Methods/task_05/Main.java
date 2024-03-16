package Session_8_Working_with_Java_Strings_String_Methods.task_05;

public class Main {

    public static void main(String[] args) {

        String s = "welcome";

        System.out.println(s.contains("wel"));  // output : true
        System.out.println(s.contains("duyb")); // output : false
        System.out.println(s.contains("Wel")); // output : false
        System.out.println(s.contains("com"));  // output : true
        System.out.println(s.contains("COM"));  // output : false
        System.out.println(s.contains("welme"));  // output : false
    }
}

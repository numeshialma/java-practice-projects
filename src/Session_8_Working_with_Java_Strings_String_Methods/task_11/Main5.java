package Session_8_Working_with_Java_Strings_String_Methods.task_11;

public class Main5 {
    public static void main(String[] args) {

        String name = "John Kenedy";
        System.out.println(name.contains("john"));   // false

        System.out.println(name.replace('J','j').contains("john"));
        // true

        System.out.println(name.toLowerCase().contains("john")); // true

    }
}

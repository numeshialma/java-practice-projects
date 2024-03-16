package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_03;

public class FinallyBlock2 {
    public static void main(String[] args) {

        // Case 3 :
        String s = "Welcome";

        try {
            System.out.println(s.length());

        } catch ( NullPointerException e) {
            System.out.println("Catch block handled exception..");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("You entered into finally block..");
        }

        System.out.println("Program finished...");
    }
}
/*
7
You entered into finally block..
Program finished...
 */
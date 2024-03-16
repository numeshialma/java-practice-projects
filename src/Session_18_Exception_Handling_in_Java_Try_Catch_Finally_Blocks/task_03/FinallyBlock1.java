package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_03;

public class FinallyBlock1 {
    public static void main(String[] args) {

        // Case 2 :
        String s = null;

        try {
            System.out.println(s.length());

        } catch ( NumberFormatException e) {
            System.out.println("Catch block handled exception..");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("You entered into finally block..");
        }

        System.out.println("Program finished...");
    }
}
/*
You entered into finally block..

error : NullPointerException
 */
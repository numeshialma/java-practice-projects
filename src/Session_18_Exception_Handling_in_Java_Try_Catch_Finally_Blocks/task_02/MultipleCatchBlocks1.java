package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_02;

public class MultipleCatchBlocks1 {

    public static void main(String[] args) {

        System.out.println("Program is started...");

        String s = null;

        System.out.println(s.length());

        try {
            System.out.println(s.length());

        } catch (ArithmeticException e) {
            System.out.println("Handle exception..");
            System.out.println(e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Handle exception..");
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Handle exception..");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Handle exception..");
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished...");
    }
}

package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        System.out.println("Program is started...");
        System.out.println("Program in progress... ");

        Thread.sleep(5000);

        FileInputStream fis =  new FileInputStream("E:\\TEXT.TXT");

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");
    }
}
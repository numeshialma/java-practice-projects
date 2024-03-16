package Session_18_Exception_Handling_in_Java_Try_Catch_Finally_Blocks.task_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions1 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Program is started...");
        System.out.println("Program in progress... ");

        FileInputStream fis =  new FileInputStream("E:\\TEXT.TXT");

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {

        }

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");
    }
}
/*
Program is started...
Program in progress...
<waiting>
Program is completed...
Program is exited...
 */
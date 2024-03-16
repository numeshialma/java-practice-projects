package Session_8_Working_with_Java_Strings_String_Methods.task_07;

public class Main {
    public static void main(String[] args) {

        String s = "welcome to selenium java selenium python selenium c#";

        System.out.println(s.replace('e','X'));
        // output : wXlcomX to sXlXnium java sXlXnium python sXlXnium c#

        System.out.println(s.replace("selenium","playwright"));
        // output : welcome to playwright java playwright python playwright c#
    }
}

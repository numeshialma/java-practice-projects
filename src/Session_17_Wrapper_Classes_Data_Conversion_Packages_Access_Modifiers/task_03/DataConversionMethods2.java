package Session_17_Wrapper_Classes_Data_Conversion_Packages_Access_Modifiers.task_03;

public class DataConversionMethods2 {

    public static void main(String[] args) {

        // String --> boolean

        String s1 = "true";   // only we can use true or false
        String s2 = "false";

        System.out.println(Boolean.parseBoolean(s1));
        System.out.println(Boolean.parseBoolean(s2));

        /*
        output :
           true
           false
         */
    }
}

package Session_17_Wrapper_Classes_Data_Conversion_Packages_Access_Modifiers.task_03;

public class DataConversionMethods3 {

    public static void main(String[] args) {

        // String --> boolean

        String s1 = "Welcome";
        // other than true, if you pass any string that will return false

        System.out.println(Boolean.parseBoolean(s1));

        /*
        output :
           false
         */
    }
}

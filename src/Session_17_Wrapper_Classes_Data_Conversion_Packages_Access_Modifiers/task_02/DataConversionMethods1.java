package Session_17_Wrapper_Classes_Data_Conversion_Packages_Access_Modifiers.task_02;

public class DataConversionMethods1 {

    public static void main(String[] args) {

        // String --> double

        String s1 = "10.06";
        String s2 = "20.0";

        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
        /*
        output :
            30.060000000000002
         */
    }
}

package Session_17_Wrapper_Classes_Data_Conversion_Packages_Access_Modifiers.task_01;

public class DataConversionMethods2 {

    public static void main(String[] args) {

        // String --> int

        String s1 = "10";
        String s2 = "20";

        System.out.println(s1+s2);

        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        /*
        output :
            1020
            30
         */
    }
}

package Session_17_Wrapper_Classes_Data_Conversion_Packages_Access_Modifiers.task_04;

public class DataConversionMethods1 {

    public static void main(String[] args) {

        //  int, double, boolean, char --> String

        int a=10;
        double d=10.06;
        char c='A';
        boolean bool=true;

        String s1 = String.valueOf(a);
        System.out.println(s1);

        String s2 = String.valueOf(d);
        System.out.println(s2);

        String s3 = String.valueOf(c);
        System.out.println(s3);

        String s4 = String.valueOf(bool);
        System.out.println(s4);


        /*
        output :
            10
            10.06
            A
            true
         */
    }
}

package Session_2_Working_with_Java_Variables_and_Data_Types;

public class task_05 {
    public static void main(String[] args) {

        // Numeric data types

        int a = 100, b= 200;
        System.out.println("The value of a is : " +a);
        System.out.println("The value of b is : " +b);
        System.out.println("The sum of a and b is : " +a+b); //sum of a and b is : 100200  // this is not our expectation

        System.out.println("The sum of a and b is : " +(a+b));

        byte by = 125;
        System.out.println(by);

        short sh = 3535;
        System.out.println(sh);

        long l = 38657988787878L;   // literal is needed   L/l
        System.out.println(l);

        // Decimal numbers - float, double
        float item_price = 15.5f;     // literal is needed   F/f
        System.out.println(item_price);

        double dbl = 687.60967;
        System.out.println(dbl);

        char grade = 'A';
        System.out.println(grade);

        String name = "John";
        System.out.println(name);

        /*
        char ch = 'ABC';    // invalid
        String chr ='ABC';     // invalid
        String st = 'A';  // invalid

         */
        String str = "A";

        boolean b1 = false;  // allows only tru/false
        System.out.println(b1);

    //    boolean b2 = "true";   // invalid. because this is a string

     //   String ba = true;   // invaild

        String b3 = "true";

        int x = 100;
       // x="welcome";   // not allowed
        x=200;   // allowed

    }
}

/*
The value of a is : 100
The value of b is : 200
The sum of a and b is : 100200  // this is not our expectation
 */
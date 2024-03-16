package Session_3_Working_with_Java_Operators_and_Expressions.task_01;

public class OperatorsDemo3 {
    public static void main(String[] args) {

        // 3. Logical operators && || !
        // returns boolean value - true / false
        // works between 2 boolean values

        boolean x = true;
        boolean y = false;

        System.out.println( x && y );   // false
        System.out.println( x || y );   // true
        System.out.println( !x  );   // false
        System.out.println( !y );   // true

        boolean b1=10>20;
        System.out.println(b1);   // false

        boolean b2=20>10;
        System.out.println(b2);   // false

        System.out.println(b1 && b2);   // false
        System.out.println(b1 || b2);   // true


        System.out.println((10<20) && (20>10));    // true
    }
}

package Session_3_Working_with_Java_Operators_and_Expressions.task_07;

public class TernaryOperator3 {
    public static void main(String[] args) {

        // var=exp? result1: result 2;

        // Example 3

        int person_age=30;
        String res=(person_age>=18)? "Eligible":"Not eligible"; /*expression is true*/
        System.out.println(res);   // Eligible


    }
}

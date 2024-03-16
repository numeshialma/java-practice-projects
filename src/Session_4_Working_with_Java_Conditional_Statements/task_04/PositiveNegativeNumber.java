package Session_4_Working_with_Java_Conditional_Statements.task_04;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        int num = 0;

        if(num>0){
            System.out.println("Positive number");
        }else if (num<0) {
            System.out.println("Negative number");
        }else {
            System.out.println("Zero");
        }
    }
}

package Session_4_Working_with_Java_Conditional_Statements.task_05;

public class LargestOf3Numbers {

    public static void main(String[] args) {

        int a=10, b=20, c=30;

        if(a>b && a>c){
            System.out.println("a is largest number " +a);
        } else if (b>a && b>c) {
            System.out.println("b is largest number " +b);
        } else {
            System.out.println("c is largest number " +c);
        }
    }
}

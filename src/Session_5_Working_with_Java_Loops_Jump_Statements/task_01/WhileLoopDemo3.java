package Session_5_Working_with_Java_Loops_Jump_Statements.task_01;

public class WhileLoopDemo3 {

    public static void main(String[] args) {

        // Example 3 :      print even numbers between 1...10

        // Approach 2

        int i=1;  // initialization

        while(i<=10){
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
/*
2
4
6
8
10
 */
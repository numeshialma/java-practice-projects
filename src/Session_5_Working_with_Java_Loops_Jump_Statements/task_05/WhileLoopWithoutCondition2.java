package Session_5_Working_with_Java_Loops_Jump_Statements.task_05;

public class WhileLoopWithoutCondition2 {
    public static void main(String[] args) {

        int i=1;

        while(true){  // means everytime the condition is satisfied
            System.out.println("Hello");
            i++;

            if(i==10){
                break;
            }
        }

    }
}
/*
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
 */
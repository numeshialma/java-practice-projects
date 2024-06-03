package Session_5_Working_with_Java_Loops_Jump_Statements.task_06;

public class BreakStatement {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);    // 1 2 3 4 //  after 5 it will be break
        }
    }
}
/*
1
2
3
4
 */
package Session_5_Working_with_Java_Loops_Jump_Statements.task_06;

public class ContinueStatement {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);    // 1 2 3 4 ((5)) 6 7 8 9 10
        }
    }
}
/*
1
2
3
4
6
7
8
9
10
 */

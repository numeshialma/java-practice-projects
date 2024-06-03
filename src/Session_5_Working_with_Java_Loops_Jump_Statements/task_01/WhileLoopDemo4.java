package Session_5_Working_with_Java_Loops_Jump_Statements.task_01;

public class WhileLoopDemo4 {

    public static void main(String[] args) {

        // Example 4 :       1...10    state even or odd

        int i=1;  // initialization

        while(i<=10){
            if(i%2==0) {
                System.out.println(i+ " Even");
            }
            else {
                System.out.println(i+ " Odd");
            }
            i++;
        }
    }
}
/*
1 Odd
2 Even
3 Odd
4 Even
5 Odd
6 Even
7 Odd
8 Even
9 Odd
10 Even
 */
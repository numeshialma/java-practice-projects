package Session_5_Working_with_Java_Loops_Jump_Statements.task_04;

public class ForLoopDemo3 {

    public static void main(String[] args) {

        // Example 3: 1...10    state even or odd
        for(int i=1; i<=10; i++ ){
            if(i%2==0){
                System.out.println(i+ " Even");
            } else {
                System.out.println(i+ " Odd");
            }
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
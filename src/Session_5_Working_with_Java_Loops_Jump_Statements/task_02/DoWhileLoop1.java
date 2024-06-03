package Session_5_Working_with_Java_Loops_Jump_Statements.task_02;

public class DoWhileLoop1 {
    public static void main(String[] args) {

        // 10 9 8 .... 1

        int i=10;

        do {
            System.out.println(i);
            i--;
        }while (i>0);   // or while(i>=1)
    }
}

/*
10
9
8
7
6
5
4
3
2
1
 */
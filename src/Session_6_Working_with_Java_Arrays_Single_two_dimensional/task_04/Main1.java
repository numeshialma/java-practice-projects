package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_04;

public class Main1 {
    public static void main(String[] args) {

        // declaring array

        // approach 2
        int a[][] = {
                {100,200},
                {300,400},
                {500,600}
        };

        // normal for loop
        for(int r=0; r<=a.length-1; r++){    // 0 1 2 3
            for(int c=0; c<=a[r].length-1; c++){   // 0 1
                System.out.print(a[r][c]+"  ");
            }
            System.out.println();
        }

        /* output :
        100  200
        300  400
        500  600
         */
    }
}

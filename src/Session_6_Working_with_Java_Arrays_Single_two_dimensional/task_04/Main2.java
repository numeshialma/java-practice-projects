package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_04;

public class Main2 {
    public static void main(String[] args) {

        // declaring array

        // approach 2
        int a[][] = {
                {100,200},
                {300,400},
                {500,600}
        };

        // normal for loop
        for(int arr[]:a){
            for(int x:arr){
                System.out.print(x+" ");
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

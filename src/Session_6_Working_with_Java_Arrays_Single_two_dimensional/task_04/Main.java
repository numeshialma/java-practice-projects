package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_04;

public class Main {
    public static void main(String[] args) {

        // declaring array

        // approach 2
        int a[][] = {
                {100,200},
                {300,400},
                {500,600}
        };

        // Find size of an array
        System.out.println("Length of rows " +a.length);
        System.out.println("length of columns "+a[0].length);

        /* output :
        Length of rows 3
        length of columns 2
         */


        // read single value from an array
        System.out.println(a[2][1]);
        // output : 600





    }
}

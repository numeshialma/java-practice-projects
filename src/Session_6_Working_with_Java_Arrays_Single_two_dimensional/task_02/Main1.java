package Session_6_Working_with_Java_Arrays_Single_two_dimensional.task_02;

public class Main1 {
    public static void main(String[] args) {

        // declaring array

        // approach 2
        int a[] = {100,200,300,400,500};

        // find length of an array
        System.out.println("length of an array "+a.length);  // output : length of an array 5

        // read single value from an array
        System.out.println(a[4]); // here 4 is index

        // reading all values from array
        // Normal for loop

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);   //  100 200 300 400 500

        }

        // enhanced for loop / for .. each loop
        for(int x:a){
            System.out.println(x);  //  100 200 300 400 500
        }
        // here not dealing with index.

    }

}

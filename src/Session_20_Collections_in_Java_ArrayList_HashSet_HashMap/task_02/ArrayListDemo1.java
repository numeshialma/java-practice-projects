package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_02;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();   

        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);

        //  Reading all the element from the array List

        // 1. Using for..each loop
        for(Object x : mylist){
            System.out.println(x);
        }

/* output :
100
10.5
Welcome
A
true
100
null
null
 */
    }
}

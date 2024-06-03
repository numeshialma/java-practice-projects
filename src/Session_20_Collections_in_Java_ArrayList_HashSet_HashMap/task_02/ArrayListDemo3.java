package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
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

        // 1. Using iterator
        Iterator it = mylist.iterator();

        System.out.println(it.hasNext());

            /* output :
                true

                reason : it returns 1 st value. so we should use for loop with this
             */

        // Checking arraylist is empty or not
        System.out.println("Is arraylist empty? "+mylist.isEmpty());

         /* output :
        Is arraylist empty? false
          */

        // Remove multiple elements from array list
        ArrayList mylist2 = new ArrayList();
        mylist2.add(100);
        mylist2.add("welcome");

        mylist.removeAll(mylist2);
        System.out.println("After removing multiple elements : " +mylist);

         /* output :
        After removing multiple elements : [10.5, Welcome, A, true, null, null]
          */

        // Remove all elements from array list / clear
        mylist.clear();
        System.out.println("Is arraylist empty? "+mylist.isEmpty());

         /* output :
        Is arraylist empty? true
          */

    }
}

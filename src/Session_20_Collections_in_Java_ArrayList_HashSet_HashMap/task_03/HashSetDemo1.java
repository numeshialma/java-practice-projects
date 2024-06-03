package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_03;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {

        // Declaration

        HashSet myset = new HashSet();    // correct notation

        myset.add(100);
        myset.add(10.5);
        myset.add("Welcome");
        myset.add(true);
        myset.add('A');
        myset.add(100);
        myset.add(100);
        myset.add(null);
        myset.add(null);
        myset.add(null);

        System.out.println(myset);

        /* output :
        [null, A, 100, 10.5, Welcome, true]
         */

        // Removing element
        myset.remove(10.5);  // not an index
        System.out.println("After removing : " +myset);

        /* output :
        After removing : [null, A, 100, Welcome, true]
         */

        // Inserting element  -  not possible

        // Access specific element  - not possible

        // Convert HashSet --> ArrayList
        ArrayList al = new ArrayList(myset);
        System.out.println(al);

        /* output :
        [null, A, 100, Welcome, true]
         */

        System.out.println(al.get(2));

        /* output :
        100
         */

        // Read all the elements using for..each
        for (Object x: myset){
            System.out.println(x);
        }

        /* output :
        null
        A
        100
        Welcome
        true

        Reason : this is not support index
         */

        // Clearing all the elements in hashSet
        myset.clear();
        System.out.println(myset);

        /* output :
        []
         */

    }
}

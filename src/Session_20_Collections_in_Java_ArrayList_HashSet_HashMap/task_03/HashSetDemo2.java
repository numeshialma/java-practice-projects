package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_03;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
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

        // Using iterator
        Iterator<Object> it = myset.iterator();

        while(it.hasNext()){
            System.out.println(it.hasNext());
        }



    }
}

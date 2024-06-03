package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_02;

import Session_10_Java_OOPS_Concepts_Class_Object_Methods.task_01.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {
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

        Iterator<Object> it = mylist.iterator();

        while(it.hasNext()){
            System.out.println(it.hasNext());
        }

        // specifying < >  is optional.
    }
}

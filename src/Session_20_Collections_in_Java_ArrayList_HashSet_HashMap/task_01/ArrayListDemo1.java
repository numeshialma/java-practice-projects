package Session_20_Collections_in_Java_ArrayList_HashSet_HashMap.task_01;

import Session_10_Java_OOPS_Concepts_Class_Object_Methods.task_02.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        // Declaration

        ArrayList mylist = new ArrayList();    // correct notation

        // Adding data into arraylist

        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);

        // Size of arrayList
        System.out.println("Size of an array list : " +mylist.size());

        // Printing arraylist
        System.out.println("Printing data from array list : " +mylist);

/* output :
Size of an array list : 8
Printing data from array list : [100, 10.5, Welcome, A, true, 100, null, null]
 */

        // Remove element from arraylist
        mylist.remove(5);      // here 5 is index of element
        System.out.println("After removing : " +mylist);

/* output :
After removing : [100, 10.5, Welcome, A, true, null, null]
 */

        // Insert element in the array List
        mylist.add(2,"Java");
        System.out.println("After inserting : " +mylist);

/* output :
After inserting : [100, 10.5, Java, Welcome, A, true, null, null]
 */

        // Modify element in the array List (modify/replace/change)
        mylist.set(2,"python");
        System.out.println("After replacing : " +mylist);

/* output :
After replacing : [100, 10.5, python, Welcome, A, true, null, null]
 */

        // Access specific element in the array List
        System.out.println(mylist.get(3)); // here 3 is index of "Welcome"

/* output :
Welcome
 */

    }
}

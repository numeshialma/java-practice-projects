package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_04;

import java.util.Arrays;

public class SortingElementsInArray1 {
    public static void main(String[] args) {

        int a[] ={3,2,4,6,9,1,5};

        System.out.println("Before sorting ");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("After sorting");
        System.out.println(Arrays.toString(a));
    }
}
/* output :
Before sorting
[3, 2, 4, 6, 9, 1, 5]
After sorting
[1, 2, 3, 4, 5, 6, 9]
 */

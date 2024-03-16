package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_05;

import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {

        String a[] = {"Dxfy","Ere","Cuy","Atrhu"};

        System.out.println("Before sorting "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting"+Arrays.toString(a));
    }
}

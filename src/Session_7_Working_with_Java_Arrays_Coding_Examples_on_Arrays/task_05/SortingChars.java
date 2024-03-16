package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_05;

import java.util.Arrays;

public class SortingChars {
    public static void main(String[] args) {

        char c[] ={'D','C','B','A'};

        System.out.println("Before sorting "+Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("After sorting "+Arrays.toString(c));
    }
}

package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_02;

public class SearchElementInArray {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int search_element = 300;

        boolean status = false;

        for (int x : a) {
            if (x == search_element) {
                System.out.println("Element found");
                break;
            }
        }

        if(status==false){
            System.out.println("Element not found");
        }
    }
    /* when the element exits:
    Element found

    when the element not exit:
    Element not found
     */

}

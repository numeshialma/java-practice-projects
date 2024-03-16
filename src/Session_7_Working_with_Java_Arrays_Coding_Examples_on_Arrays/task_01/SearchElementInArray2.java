package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_01;

public class SearchElementInArray2 {
    public static void main(String[] args) {

        int a[] ={10,20,30,40,50};
        int search_element = 300;

        boolean status = false;    // false - not found     true - found
        for(int i=0; i<a.length;i++){
            if(a[i]==search_element){
                System.out.println("Element found");
                status=true;
                break;
            }
        }
        if (status==false){
            System.out.println("Element tot found");
        }

    }
    /* when the element exits:
    Element found

    when the element not exit:
    Element not found
     */
}

package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_01;

public class SearchElementInArray {
    public static void main(String[] args) {

        int a[] ={10,20,30,40,50};
        int search_element = 30;

        for(int i=0; i<a.length;i++){
            if(a[i]==search_element){
                System.out.println("Element found");
                break;
            } else {
                System.out.println("Element not found");
            }
        }
    }
    /*
    Element not found
    Element not found
    Element found
     */
}

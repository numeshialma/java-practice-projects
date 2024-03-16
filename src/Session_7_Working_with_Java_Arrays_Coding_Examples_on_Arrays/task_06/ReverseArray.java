package Session_7_Working_with_Java_Arrays_Coding_Examples_on_Arrays.task_06;

public class ReverseArray {
    public static void main(String[] args) {

        int a[] = {100,200,300,400,500};

        for(int i=a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }

    }
}

// enhanced for loop not working for reverse.
/* output :
500
400
300
200
100
 */
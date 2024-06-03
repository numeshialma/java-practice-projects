package Session_18_Part_2_Type_Casting_in_Java_Up_Casting_Down_Casting.task_14;


// A b = (C) d;

public class TypeCastingObject {
    public static void main(String[] args) {

        // Example 3
        Object o = new String("Welcome");
        StringBuffer sb = (StringBuffer) o;  // Rule 1 : yes  Rule 2 : yes  Rule 1 : failed

        

    }
}

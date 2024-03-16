package Session_18_Part_2_Type_Casting_in_Java_Up_Casting_Down_Casting.task_01;

// Upcasting - converting value from smaller --> larger

// int --> long
// float --> double

// Downcasting - converting value from larger --> smaller

// long --> int
// double --> float

public class TypeCastingConcept3 {

    public static void main(String[] args) {

        // downcasting - manually ----- larger to smaller

        double doublevalue = 123.33;
        float floatvalue = (float) doublevalue;

        System.out.println(doublevalue);   // 123.33


    }

}

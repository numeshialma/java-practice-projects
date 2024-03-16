package Session_18_Part_2_Type_Casting_in_Java_Up_Casting_Down_Casting.task_01;

// Upcasting - converting value from smaller --> larger

// int --> long
// float --> double

// Downcasting - converting value from larger --> smaller

// long --> int
// double --> float

public class TypeCastingConcept2 {

    public static void main(String[] args) {

        // downcasting - manually ----- larger to smaller

        long longvalue = 1000000;
        int intvalue = (int)longvalue;

        System.out.println(longvalue);   // 1000000


    }

}

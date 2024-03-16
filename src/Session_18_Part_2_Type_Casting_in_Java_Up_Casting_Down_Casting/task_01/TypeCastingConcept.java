package Session_18_Part_2_Type_Casting_in_Java_Up_Casting_Down_Casting.task_01;

// Upcasting - converting value from smaller --> larger

// int --> long
// float --> double

// Downcasting - converting value from larger --> smaller

// long --> int
// double --> float

public class TypeCastingConcept {

    public static void main(String[] args) {

        // upcasting - automatic ----- smaller to larger

        int intvalue = 100;
        long longvalue=intvalue;
        System.out.println(longvalue);   // 100

    }

}

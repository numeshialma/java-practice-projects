package Session_16_Java_OOPS_Concepts_Data_Abstraction_Interface_Concept.task_02;

interface Shape {
    int length=10;   // final & static
    int width=20;   // final & static

    void circle();      // abstract method

    default void square(){      // default method
        System.out.println("this is square - default method");
    }

    static void rectangle(){      // static method
        System.out.println("this is rectangle - static method");
    }


}

/*
public class InterfaceDemo implements Shape {
/*
    void circle() {    // reason : this is default modifier.
        System.out.println("This is circle - abstract method");
    }

 */
/*
    public static void main(String[] args) {

    }
}
*/

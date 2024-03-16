package Session_16_Java_OOPS_Concepts_Data_Abstraction_Interface_Concept.task_08;

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


public class InterfaceDemo implements Shape {

    public void circle() {    // reason : this is default modifier.
        System.out.println("This is circle - abstract method");
    }

    void triangle(){   // default method
        System.out.println("This is triangle.. ");
    }

    int x=100, y=200;

    public static void main(String[] args) {
// Scenario 1
        InterfaceDemo idobj = new InterfaceDemo();

        idobj.circle();
        idobj.square();
/*
        rectangle();  // we cannot call like this.
*/
        Shape.rectangle();    // static method can directly access from interface

        System.out.println(idobj.x+idobj.y);

// Scenario 2
        Shape sh = new InterfaceDemo();

        sh.circle();      // abstract method
        sh.square();      // default method

        Shape.rectangle();   // static method can directly access from interface


        System.out.println(Shape.length*Shape.width); // accessing static variables directly
/*
        System.out.println(sh.x+sh.y);  // we cannot access

 */
    }
}

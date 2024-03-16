package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_02;

public class StaticDemo {

    static int a = 10;   // static variable
    int b = 20;   // non-static variable

    static void m1(){   // static method
        System.out.println("this is m1 static method..");
    }

    void m2(){   // non-static method
        System.out.println("this is m2 non-static method..");
    }

    public static void main(String[] args) {

        // 1.

        System.out.println(a);
        m1();
/*
        System.out.println(b);
        m2();

 */

    }
}

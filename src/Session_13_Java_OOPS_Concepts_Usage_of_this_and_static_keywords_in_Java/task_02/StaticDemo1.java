package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_02;

public class StaticDemo1 {

    static int a = 10;   // static variable
    int b = 20;   // non-static variable

    static void m1(){   // static method
        System.out.println("this is m1 static method..");
    }

    void m2(){   // non-static method
        System.out.println("this is m2 non-static method..");
    }

    public static void main(String[] args) {

        // 2.

        StaticDemo1 sd = new StaticDemo1();
        System.out.println(sd.b);
        sd.m2();

    }
}

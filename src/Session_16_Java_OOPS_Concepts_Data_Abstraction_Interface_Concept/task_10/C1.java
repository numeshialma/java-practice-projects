package Session_16_Java_OOPS_Concepts_Data_Abstraction_Interface_Concept.task_10;

import Session_16_Java_OOPS_Concepts_Data_Abstraction_Interface_Concept.task_09.I1;
import Session_16_Java_OOPS_Concepts_Data_Abstraction_Interface_Concept.task_09.I2;

public class C1 extends C2 implements I1, I2 {

    public void m1(){
        System.out.println(x);
    }

    public void m2(){
        System.out.println(y);
    }

    public static void main(String[] args) {

        C1 c1Obj = new C1();
        c1Obj.m1();
        c1Obj.m2();

        c1Obj.m3();
    }
}
/*
output : 100
         200
         300
 */
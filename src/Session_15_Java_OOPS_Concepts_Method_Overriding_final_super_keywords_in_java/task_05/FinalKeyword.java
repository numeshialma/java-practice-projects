package Session_15_Java_OOPS_Concepts_Method_Overriding_final_super_keywords_in_java.task_05;

class Test {
    final int x=100;
}

public class FinalKeyword {
    public static void main(String[] args) {

        Test t = new Test();

        // t.x=290;   // incorrect
        System.out.println(t.x);
    }
}

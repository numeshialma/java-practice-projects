package Session_11_Java_OOPS_Concepts_Java_Methods_Constructors.task_04;

public class ConstructorDemo {
    int x,y;
    // default constructor
    ConstructorDemo(){
        x=100;
        y=200;
    }
    // parameterized constructor
    ConstructorDemo(int a, int b){
        x=a;
        y=b;
    }
    void sum(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {

        ConstructorDemo cd = new ConstructorDemo();  // invoke constructor
        cd.sum();

        ConstructorDemo cd1 = new ConstructorDemo(10,20);  // parameterized constructor
        cd1.sum();
    }
}

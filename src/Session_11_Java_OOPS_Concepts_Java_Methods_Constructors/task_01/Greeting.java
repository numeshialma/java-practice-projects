package Session_11_Java_OOPS_Concepts_Java_Methods_Constructors.task_01;

public class Greeting {

    // 1. No params + No return value
    void m1(){
        System.out.println(" Hi..");
    }


    // 2.	No params + Return value
    String m2(){
        return ("Hi, how are you??");  // bracket is optional   // return "Hi, how are you??" ;
    }


    //  3.	Takes params + No return value
    void m3(String name){
        System.out.println("Hello"+name);
    }

    // 4.	Takes params + Return value
    String m4(String name){
        return  "Hello"+name;
    }
}

// parameters are called as arguments


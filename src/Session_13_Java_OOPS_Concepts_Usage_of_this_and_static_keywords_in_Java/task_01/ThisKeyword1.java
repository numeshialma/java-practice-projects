package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_01;

public class ThisKeyword1 {

    int x,y;    // class variables / instance variables

    ThisKeyword1(int x, int y){
        x=x;
        y=x;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword1 th = new ThisKeyword1(100,200);   // we have to pass parameters

        th.display();    // 0 0
    }
}

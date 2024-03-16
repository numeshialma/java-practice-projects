package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_01;

public class ThisKeyword2 {

    int x,y;    // class variables / instance variables

    ThisKeyword2(int x, int y){
        this.x=x;
        this.y=y;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword2 th = new ThisKeyword2(100,200);   // we have to pass parameters

        th.display();    // 100 200
    }
}

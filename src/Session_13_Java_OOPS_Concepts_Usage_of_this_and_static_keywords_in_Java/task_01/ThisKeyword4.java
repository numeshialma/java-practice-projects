package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_01;

public class ThisKeyword4 {

    int x,y;    // class variables / instance variables

    void setData(int x, int y){
        x=x;
        y=y;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword4 th = new ThisKeyword4();
        th.setData(100,200);    // 0 0
    }
}

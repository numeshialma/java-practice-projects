package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_01;

public class ThisKeyword3 {

    int x,y;    // class variables / instance variables



    void setData(int a, int b){
        x=a;
        y=b;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword3 th = new ThisKeyword3();
        th.setData(100,200);    // 100 200
    }
}

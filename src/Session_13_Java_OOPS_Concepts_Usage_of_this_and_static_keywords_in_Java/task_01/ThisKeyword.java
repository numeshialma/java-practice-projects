package Session_13_Java_OOPS_Concepts_Usage_of_this_and_static_keywords_in_Java.task_01;

public class ThisKeyword {

    int x,y;    // class variables / instance variables

    ThisKeyword(int a,int b){
        x=a;
        y=b;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword th = new ThisKeyword(100,200);   // we have to pass parameters

        th.display();    // 100 200
    }
}

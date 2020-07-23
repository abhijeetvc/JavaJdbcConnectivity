import java.util.ArrayList;
import java.util.List;

class Demo4{

    public Demo4(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        List<String> list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        list.forEach(Demo4::new);   //Method Reference to constructor
//        new Demo4("A");
//        new Demo4("B");
//        new Demo4("C");
    }
}

//public class MethodReference4 {
//
//}

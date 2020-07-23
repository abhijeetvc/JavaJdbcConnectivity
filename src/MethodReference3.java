
//Reference to an instance method of an arbitrary object of particular type

import java.util.ArrayList;
import java.util.List;

class Demo3{
    String s=null;
   // int total;
    public Demo3(String s){
        this.s=s;  // this is a keyword in Java. It is used to refer to current object
    }

    void display(){
        System.out.println(s);
    }

}

public class MethodReference3 {

    public static void main(String[] args) {

//        Demo3 d1=new Demo3("A");
//        Demo3 d2=new Demo3("B");
//        Demo3 d3=new Demo3("C");

        List<Demo3> list=new ArrayList();
        list.add(new Demo3("A"));
        list.add(new Demo3("B"));
        list.add(new Demo3("C"));

        list.forEach(Demo3::display);
    }
}

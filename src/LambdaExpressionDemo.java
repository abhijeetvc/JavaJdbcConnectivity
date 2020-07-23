// Lambda Expression: It is introduced in Java 8.
//Lambda Expression is an anonymous function


//Syntax:  (a,b) -> a+b;

//Implementation is more important than learning.

@FunctionalInterface
interface MyInterface1{
    String display();
 //   void getData();
}

interface MyInterface2{
    void showNo(int a);
}

interface AddNumbers{
    int add(int a, int b);  //abstract method

}

public class LambdaExpressionDemo{
    public static void main(String[] args) {

//        LambdaExpressionDemo l=new LambdaExpressionDemo();
//        String s=l.display();
//        System.out.println(s);

        MyInterface1 m=()->"Hello Java 8";
        System.out.println(m.display());

        MyInterface2 m1=((a) -> System.out.println("Value of a: "+a));
        m1.showNo(40);

        AddNumbers m2=((a,b)->a+b);
        System.out.println("addition is: "+m2.add(10,20));
    }



//    @Override
//    public String display() {
//        return "Hello Java 8";
//    }
}

abstract class MyDemo{
    void display(){
        System.out.println("Helllooooo");
    }

    abstract void display1();
}

interface MyDemoInterface{
    String getData();  //abstract method

    default String getData1(){
        return "Hello Java 8";
    }
}
public class PracticeDemo1 implements MyDemoInterface{

    public static void main(String[] args) {
        PracticeDemo1 p=new PracticeDemo1();
      //  String s1=p.getData();
      //  String s2=p.getData1();
        System.out.println(p.getData());
        System.out.println(p.getData1());
    }

    @Override
    public String getData() {
        return "Hiiiiii";
    }
}

import java.util.function.Function;
//Function Examples
// Function: It is a functional interface
// T & R
// T -> an argument/an input
// R -> an object

interface FunctionDemo1{
    int apply(String s);
}

public class FunctionDemo implements FunctionDemo1 {

    public static void main(String[] args) {
//        Function<String,Integer> f=str->str.length();
//        Integer i=f.apply("Abhijeet");
//        System.out.println(i);

        FunctionDemo f=new FunctionDemo();
        Integer i=f.apply("Abhijeet");
        System.out.println(i);
    }

    @Override
    public int apply(String s) {
        return s.length();
    }
}

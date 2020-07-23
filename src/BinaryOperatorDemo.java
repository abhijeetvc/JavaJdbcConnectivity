import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//Binary Operator: It is a functional Interface
// Takes two arguments of same type and
// returns the result of the same type

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bi=(a, b)->a+b;
        Integer i=bi.apply(10,20);
        System.out.println(i);

        BinaryOperator<Integer> bo=(a,b)->a+b;
        Integer i1=bo.apply(30,40);
        System.out.println(i1);

    }
}

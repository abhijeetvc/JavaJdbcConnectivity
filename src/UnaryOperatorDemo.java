//UnaryOperator : It is a functional interface

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
        Function<Integer,Integer> f=a->a*10;
        Integer i=f.apply(50);
        System.out.println(i);

        UnaryOperator<Integer> uo=b->b*10;
        Integer i1=uo.apply(40);
        System.out.println(i1);
    }
}

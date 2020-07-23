//Bi-Function : Bi-Function is a Functional Interface

// It takes two arguments as the input and it returns an object as output

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bi=(a,b)->a+b;
        Integer i=bi.apply(10,20);
        System.out.println(i);
    }
}

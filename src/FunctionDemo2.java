import java.util.function.Function;

public class FunctionDemo2 {

    public static void main(String[] args) {
        Function<String,Integer> f=a->a.length();
        Function<Integer,Integer> f1=b->b*10;

        Integer i=f.andThen(f1).apply("Abhijeet");
        System.out.println(i);
    }
}

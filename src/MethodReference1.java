import java.util.Arrays;
import java.util.List;

//Reference to a static method
public class MethodReference1 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("India","Japan","Australia","France");

       // list.forEach(s->Demo1.display(s));

        //Method Reference to a static method
        list.forEach(Demo1::display);
    }
}

class Demo1{

    public static void display(String s){
        System.out.println(s);
    }
}
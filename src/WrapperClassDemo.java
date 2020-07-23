//Primitive Data Types: byte, short, boolean, int, double, float, char, long
//Wrapper classes     : Byte, Short, Boolean, Integer, Double, Float, Character, Long

public class WrapperClassDemo {

    public static void main(String[] args) {

        String str="5000";

        String str1="5000.55";

        Integer i=Integer.parseInt(str);
        System.out.println("Value of i: "+i);

        Double d=Double.parseDouble(str1);
        System.out.println("Value of d: "+d);
    //    int a=str;

    }
}

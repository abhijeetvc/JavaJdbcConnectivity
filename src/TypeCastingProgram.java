import java.util.ArrayList;

//Type Casting: Process of converting the value of one data type to another data type
// 2 Major types : 1) Widening Type Casting, 2) Narrowing Type Casting
public class TypeCastingProgram {
    public static void main(String[] args) {

        int a=50;
        System.out.println("value of a: "+a);

        double b=a;    //Widening
        System.out.println("value of b: "+b);

        double x=50.55;
        System.out.println("value of x: "+x);

        int y= (int) x;  //Narrowing
        System.out.println("value of y: "+y);

        int x1=70;
        System.out.println("value of x1: "+x1);

        String str=String.valueOf(x1);
        System.out.println("value of str : "+str);

        String str1="200.55";
        System.out.println("value of str1: "+str1);

        int x2=Integer.parseInt(str);
        System.out.println("value of x2: "+x2);

        double d1=Double.parseDouble(str1);

        int a1=70;
        //Wrapper Object
        Integer a11=a1;    //Autoboxing
        System.out.println("value of a11 : "+a11);

        ArrayList<Integer> list=new ArrayList();
        list.add(10);  //javac automatically converts primitive type to corresponding wrapper object

        Integer a12=80;

        int a13=a12;  //Unboxing
        System.out.println("value of a13: "+a13);

    }
}

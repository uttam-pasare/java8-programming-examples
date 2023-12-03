import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class C3FunctionExamples {
    public static void main(String[] args) {
        Function<Integer,String> fucntion = Object::toString;
        System.out.println(fucntion.apply(10));

        BiFunction<Integer,String,Boolean> biFunction = (number,value) -> number.compareTo(value.length()) == 0;
        System.out.println(biFunction.apply(7, "welcome to Java"));

        BinaryOperator<Integer> binary = (x,y) -> x * y;
        System.out.println(binary.apply(1,2));

        IntBinaryOperator intBinaryOperator = (x,y) -> x*y;
        System.out.println(intBinaryOperator.applyAsInt(2,3));
    }
}

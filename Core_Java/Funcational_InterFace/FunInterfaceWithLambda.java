import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

interface Greeting{
    void sayHello();
}
class FunInterfaceWithLambda{
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello");

        g.sayHello();


        // Predicate Method
        Predicate<Integer> isEven = n-> n%2==0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));

        // FunctionMethod
        Function<String,Integer> len = s -> s.length();
        System.out.println(len.apply("hello"));

        // Consumer Method
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello Java");

        // Supplier Method
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
package Java_8_Features;

import java.util.function.BiConsumer;

public class Demo{
    public int add(int a, int b){
        return a+b;
    }

    static void main() {
        // Normal execution
        Demo d= new Demo();
        System.out.println(d.add(6,1));

        // Reduced to two lines of code
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(3,4);
    }
}

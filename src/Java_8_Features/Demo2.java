package Java_8_Features;

public class Demo2 implements FunctionalInterfaceDemo{


    static void main() {
        Demo2 d = new Demo2();
        d.add(6,7);
    }

    @Override
    public void add(int a, int b) {
        FunctionalInterfaceDemo f = (x,y) -> System.out.println(x+y);
    }
}

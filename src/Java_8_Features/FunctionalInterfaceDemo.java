package Java_8_Features;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

     void add(int a, int b);

  //   void minus(int a, int b);  // not allowed

     default int getValue(){
         return 1;
     }

     static String getName(){
         return "Sneha";
     }
}

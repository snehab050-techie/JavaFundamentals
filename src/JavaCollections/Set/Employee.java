package JavaCollections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee {

    static void main() {
        Set<String> email = new HashSet<>();
        email.add("sneha@gmail.com");
        email.add("Suhas@gmail.com");
        email.add("basu@gmail.com");
        email.add("kaggal@gmail.com");

        email.forEach(System.out::println);

        int i = email.hashCode();
        System.out.println(i);

        Set<Integer> s =new LinkedHashSet<>();
        s.add(34);
        s.add(78);
        s.add(90);
        s.add(23);
        s.add(10);

        System.out.println(s);

        Set<Integer> ts = new TreeSet<>();
        ts.add(89);
//        ts.add(null); // will throw a null pointer exception
        ts.add(18);
        ts.add(35);
        ts.add(10);

        System.out.println(ts);
   }
}

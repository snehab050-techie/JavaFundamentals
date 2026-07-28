package Java_8_Features.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
    static void main() {

        //Before java 8
        List<String> empNames = Arrays.asList("Sneha","Priya","Suhas","Janaki","Bhuvaneshwari","Sundar");
        for(String name:empNames){
            if(name.startsWith("S")){
                System.out.println(name);   //Imagine if we have 10 million records..more loops and conditions..diificult to manage and process
            }
        }

        //After Java 8 - Streams
        List<String> en = empNames.stream()
                .filter(ename -> ename.startsWith("S"))
                .toList();
        System.out.println(en);

        //filter()
        //fetch only even numbers
        List<Integer> lis = Arrays.asList(18,29,80,23,20,46);
        lis.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

        //add prefix 'EMP' to emp Ids
        List<Integer> empIds = Arrays.asList(101,102,103,104);
        empIds.stream()
                .map(id -> "EMP-" + id)
                .forEach(System.out::println);
    }
}

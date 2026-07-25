package JavaCollections.List;

import java.util.*;

public class DemoIterator {

    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(90,23,45,76,12,83,789));

        //Print even numbers
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int num = it.next();
            if(num % 2 == 0){
                System.out.println(num);
            }
        }

        //Count total number of elements
        Iterator<Integer> it1 = list.iterator();
        int count = 0;
        while(it1.hasNext()){
            it1.next();
            count++;
        }
        System.out.println("Total number of elements: "+count);

        //Find maximum number
        Iterator<Integer> it2 = list.iterator();
        int max = list.getFirst();
        while(it2.hasNext()){
           int num = it2.next();
           if(num>max){
               max = num;
           }
        }
        System.out.println("Max no is: "+max);

        //Remove all odd numbers
        List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Iterator<Integer> nLis =numList.iterator();
        while(nLis.hasNext()){
            int num = nLis.next();
            if(num%2!=0){
                nLis.remove();
            }
        }
        System.out.println("Lst after removing odd numbers: "+numList);

        //Store employee names and print only the names starting with S
        Set<String> empNames = new HashSet<>();

        empNames.add("Sneha");
        empNames.add("Janu");
        empNames.add("Suhas");
        empNames.add("Basu");

         Iterator<String> set =empNames.iterator();
         while(set.hasNext()){
             String s = set.next();
             if(s.startsWith("S") || s.startsWith("s")){
                 System.out.println(s);
             }
         }

         //Store fruit names and remove Apple using an Iterator
        List<String> fruitsList = new ArrayList<>(Arrays.asList("WaterMelon","Apple","JackFruit"));
         java.util.Iterator<String> fList = fruitsList.iterator();

         // throws conCurrentModificationException - changes to collection while iteration is not possible
        /*for(String s: fruitsList){
            if(s.equals("Apple")){
                fruitsList.remove("Apple");
            }
        }
*/
         while(fList.hasNext()){
             String s = fList.next();
             if(s.equals("Apple")){
                 fruitsList.remove("Apple");
             }
             System.out.println(fruitsList);
         }

    }
}

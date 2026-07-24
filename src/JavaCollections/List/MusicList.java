package JavaCollections.List;

import java.util.LinkedList;

//LinkedList
public class MusicList {

    static void main() {

        LinkedList<Integer> l =new LinkedList<>();
        l.add(23);
        l.add(78);
        l.add(65);
        l.add(69);

        l.forEach(System.out::println);

        int p = l.peek();
        System.out.println(p);

        l.pop();
        System.out.println(l);
        }
}

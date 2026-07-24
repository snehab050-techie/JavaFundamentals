package JavaCollections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

//ArrayList
public class ShoppingCart {

    public static void viewMyCart(ArrayList<String> myCart){

        // for each loop
        System.out.println("------------------");
        for(String myCartItem: myCart){
            System.out.println(myCartItem);
        }

        //traditional for loop
        System.out.println("------------------");
        for(int i= 0;i<myCart.size();i++){
            System.out.println(myCart.get(i));
        }

        //for each method
        System.out.println("------------------");
        myCart.forEach(item -> System.out.println(item));

        //method referencing
        System.out.println("------------------");
        myCart.forEach(System.out::println);

        //iteartor()
        System.out.println("------------------");
        Iterator<String> it = myCart.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //ListIterator
        System.out.println("------------------");
        ListIterator<String> lit = myCart.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }

        //streams - Java v8
        System.out.println("------------------");
        myCart.stream().filter(item -> item.startsWith("S")).forEach(System.out::println);

    }

    static void main() {

        ArrayList<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Shoes");
        shoppingCart.add("Brush");
        shoppingCart.add("Book");
        shoppingCart.add("Cloth");
        shoppingCart.add("Shells");

        //Other way to create an arrayList object
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(89,23,78,29,56));
        a2.forEach(System.out::println);

        ShoppingCart.viewMyCart(shoppingCart);
    }
}

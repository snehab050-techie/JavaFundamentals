package JavaCollections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

//Map
public class ProductInfo {
    static void main() {

        Map<Integer,String> product = new HashMap<>();
        product.put(1,"Soap");
        product.put(2,"Pen");
        product.put(3,"Books");
        product.put(4,"Pencil");

        product.forEach((pId,item) -> System.out.println(pId+" : "+item));

        product.put(2,"Paper"); // current value will be updated

        System.out.println(product);
        System.out.println(product.values());
        System.out.println(product.keySet());

        product.remove(1);

        System.out.println(product);

        Iterator<String> it = product.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

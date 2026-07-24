package JavaCollections.List;

import java.util.ArrayList;

//ArrayList
public class ShoppingCart {

    public static void viewMyCart(ArrayList<String> myCart){
        for(String myCartItem: myCart){
            System.out.println(myCartItem);
        }
    }

    static void main() {

        ArrayList<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Shoes");
        shoppingCart.add("Brush");
        shoppingCart.add("Book");
        shoppingCart.add("Cloth");
        shoppingCart.add("Pen");

        ShoppingCart.viewMyCart(shoppingCart);
    }
}

package Liskov_TellDontAsk;

import java.util.ArrayList;
import java.util.List;

public class PricingUtils0 {

    public static void main(String[] args) {
        Product p1  = new Product();
        Product p2  = new Product();
        Product p3  = new Product();

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        for (Product product : productList){

            //todo this Asking part should be avoided
            if(product instanceof InHouseProduct0){
                ((InHouseProduct0) product).applyExtraDiscount();
            }
            System.out.println(product.getDiscount());
        }
    }

}

package chapter6.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        super();
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class FilterCollectionData {

    public static void main(String args[]){

        List<Product> list = new ArrayList<> ();
        list.add(new Product(1,"Samsung",17000f));
        list.add(new Product(2,"Vivo",15000f));
        list.add(new Product(3,"Iphone 6S",55000f));
        list.add(new Product(5,"RealMe",20000f));
        list.add(new Product(6,"OPPO",12000f));

        // using lambda to filter data
       Stream<Product> filtered_data = list.stream ().filter ( p ->p.price>17000f);

        // using lambda to iterate through collection
        filtered_data.forEach (
                product -> System.out.println ( product.name+": "+product.price));
    }

}

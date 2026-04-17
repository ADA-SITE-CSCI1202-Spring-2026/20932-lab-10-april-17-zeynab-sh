import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Product{
    String name;
    double price;
    boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product -> name='" + name + "', price=" + price + ", inStock=" + inStock;
    }
}

class Filtering{
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();

        products.add(new Product("Pen", 5.0, true));
        products.add(new Product("Notebook", 12.5, true));
        products.add(new Product("Laptop", 950.0, true));
        products.add(new Product("Bag", 40.0, false));
        products.add(new Product("Bottle", 15.0, true));
        products.add(new Product("Airpods", 120.0, true));

        Predicate<Product> isAffordable = p -> p.price < 50 && p.inStock;

        products.removeIf(p -> p.price >= 50 || !p.inStock);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}


